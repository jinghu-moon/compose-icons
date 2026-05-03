package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignBottom: ImageVector
    get() {
        if (_alignBottom != null) return _alignBottom!!
        _alignBottom = phosphorThinIcon(
            name = "AlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 218.20914f, 218.20914f, 220.0f, 216.0f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(37.79086f, 220.0f, 36.0f, 218.20914f, 36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 213.79086f, 37.79086f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(218.20914f, 212.0f, 220.0f, 213.79086f, 220.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 176.0f),
                    PathNode.LineTo(140.0f, 80.0f),
                    PathNode.CurveTo(140.0f, 73.37258f, 145.37259f, 68.0f, 152.0f, 68.0f),
                    PathNode.LineTo(192.0f, 68.0f),
                    PathNode.CurveTo(198.62741f, 68.0f, 204.0f, 73.37258f, 204.0f, 80.0f),
                    PathNode.LineTo(204.0f, 176.0f),
                    PathNode.CurveTo(204.0f, 182.62741f, 198.62741f, 188.0f, 192.0f, 188.0f),
                    PathNode.LineTo(152.0f, 188.0f),
                    PathNode.CurveTo(145.37259f, 188.0f, 140.0f, 182.62741f, 140.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 178.20914f, 149.79086f, 180.0f, 152.0f, 180.0f),
                    PathNode.LineTo(192.0f, 180.0f),
                    PathNode.CurveTo(194.20914f, 180.0f, 196.0f, 178.20914f, 196.0f, 176.0f),
                    PathNode.LineTo(196.0f, 80.0f),
                    PathNode.CurveTo(196.0f, 77.79086f, 194.20914f, 76.0f, 192.0f, 76.0f),
                    PathNode.LineTo(152.0f, 76.0f),
                    PathNode.CurveTo(149.79086f, 76.0f, 148.0f, 77.79086f, 148.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 176.0f),
                    PathNode.LineTo(52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 33.37258f, 57.37258f, 28.0f, 64.0f, 28.0f),
                    PathNode.LineTo(104.0f, 28.0f),
                    PathNode.CurveTo(110.62742f, 28.0f, 116.0f, 33.37258f, 116.0f, 40.0f),
                    PathNode.LineTo(116.0f, 176.0f),
                    PathNode.CurveTo(116.0f, 182.62741f, 110.62742f, 188.0f, 104.0f, 188.0f),
                    PathNode.LineTo(64.0f, 188.0f),
                    PathNode.CurveTo(57.37258f, 188.0f, 52.0f, 182.62741f, 52.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 176.0f),
                    PathNode.CurveTo(60.0f, 178.20914f, 61.79086f, 180.0f, 64.0f, 180.0f),
                    PathNode.LineTo(104.0f, 180.0f),
                    PathNode.CurveTo(106.20914f, 180.0f, 108.0f, 178.20914f, 108.0f, 176.0f),
                    PathNode.LineTo(108.0f, 40.0f),
                    PathNode.CurveTo(108.0f, 37.79086f, 106.20914f, 36.0f, 104.0f, 36.0f),
                    PathNode.LineTo(64.0f, 36.0f),
                    PathNode.CurveTo(61.79086f, 36.0f, 60.0f, 37.79086f, 60.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _alignBottom!!
    }

private var _alignBottom: ImageVector? = null
