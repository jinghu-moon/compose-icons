package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorThinIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 112.0f),
                    PathNode.CurveTo(180.0f, 114.20914f, 178.20914f, 116.0f, 176.0f, 116.0f),
                    PathNode.LineTo(96.0f, 116.0f),
                    PathNode.CurveTo(93.79086f, 116.0f, 92.0f, 114.20914f, 92.0f, 112.0f),
                    PathNode.CurveTo(92.0f, 109.79086f, 93.79086f, 108.0f, 96.0f, 108.0f),
                    PathNode.LineTo(176.0f, 108.0f),
                    PathNode.CurveTo(178.20914f, 108.0f, 180.0f, 109.79086f, 180.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 140.0f),
                    PathNode.LineTo(96.0f, 140.0f),
                    PathNode.CurveTo(93.79086f, 140.0f, 92.0f, 141.79086f, 92.0f, 144.0f),
                    PathNode.CurveTo(92.0f, 146.20914f, 93.79086f, 148.0f, 96.0f, 148.0f),
                    PathNode.LineTo(176.0f, 148.0f),
                    PathNode.CurveTo(178.20914f, 148.0f, 180.0f, 146.20914f, 180.0f, 144.0f),
                    PathNode.CurveTo(180.0f, 141.79086f, 178.20914f, 140.0f, 176.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 64.0f),
                    PathNode.LineTo(228.0f, 184.0f),
                    PathNode.CurveTo(228.0f, 195.0457f, 219.0457f, 204.0f, 208.0f, 204.0f),
                    PathNode.LineTo(32.0f, 204.0f),
                    PathNode.CurveTo(20.985472f, 204.00009f, 12.044058f, 195.09444f, 12.0f, 184.08f),
                    PathNode.LineTo(12.0f, 88.0f),
                    PathNode.CurveTo(12.0f, 85.79086f, 13.790861f, 84.0f, 16.0f, 84.0f),
                    PathNode.CurveTo(18.209139f, 84.0f, 20.0f, 85.79086f, 20.0f, 88.0f),
                    PathNode.LineTo(20.0f, 184.0f),
                    PathNode.CurveTo(20.0f, 190.62741f, 25.372583f, 196.0f, 32.0f, 196.0f),
                    PathNode.CurveTo(38.62742f, 196.0f, 44.0f, 190.62741f, 44.0f, 184.0f),
                    PathNode.LineTo(44.0f, 64.0f),
                    PathNode.CurveTo(44.0f, 57.37258f, 49.37258f, 52.0f, 56.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(222.62741f, 52.0f, 228.0f, 57.37258f, 228.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 61.79086f, 218.20914f, 60.0f, 216.0f, 60.0f),
                    PathNode.LineTo(56.0f, 60.0f),
                    PathNode.CurveTo(53.79086f, 60.0f, 52.0f, 61.79086f, 52.0f, 64.0f),
                    PathNode.LineTo(52.0f, 184.0f),
                    PathNode.CurveTo(52.010178f, 188.32906f, 50.60557f, 192.54286f, 48.0f, 196.0f),
                    PathNode.LineTo(208.0f, 196.0f),
                    PathNode.CurveTo(214.62741f, 196.0f, 220.0f, 190.62741f, 220.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
