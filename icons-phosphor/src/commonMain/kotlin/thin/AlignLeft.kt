package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) return _alignLeft!!
        _alignLeft = phosphorThinIcon(
            name = "AlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 218.20914f, 42.20914f, 220.0f, 40.0f, 220.0f),
                    PathNode.CurveTo(37.79086f, 220.0f, 36.0f, 218.20914f, 36.0f, 216.0f),
                    PathNode.LineTo(36.0f, 40.0f),
                    PathNode.CurveTo(36.0f, 37.79086f, 37.79086f, 36.0f, 40.0f, 36.0f),
                    PathNode.CurveTo(42.20914f, 36.0f, 44.0f, 37.79086f, 44.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 104.0f),
                    PathNode.LineTo(68.0f, 64.0f),
                    PathNode.CurveTo(68.0f, 57.37258f, 73.37258f, 52.0f, 80.0f, 52.0f),
                    PathNode.LineTo(176.0f, 52.0f),
                    PathNode.CurveTo(182.62741f, 52.0f, 188.0f, 57.37258f, 188.0f, 64.0f),
                    PathNode.LineTo(188.0f, 104.0f),
                    PathNode.CurveTo(188.0f, 110.62742f, 182.62741f, 116.0f, 176.0f, 116.0f),
                    PathNode.LineTo(80.0f, 116.0f),
                    PathNode.CurveTo(73.37258f, 116.0f, 68.0f, 110.62742f, 68.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 104.0f),
                    PathNode.CurveTo(76.0f, 106.20914f, 77.79086f, 108.0f, 80.0f, 108.0f),
                    PathNode.LineTo(176.0f, 108.0f),
                    PathNode.CurveTo(178.20914f, 108.0f, 180.0f, 106.20914f, 180.0f, 104.0f),
                    PathNode.LineTo(180.0f, 64.0f),
                    PathNode.CurveTo(180.0f, 61.79086f, 178.20914f, 60.0f, 176.0f, 60.0f),
                    PathNode.LineTo(80.0f, 60.0f),
                    PathNode.CurveTo(77.79086f, 60.0f, 76.0f, 61.79086f, 76.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 152.0f),
                    PathNode.LineTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 198.62741f, 222.62741f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(80.0f, 204.0f),
                    PathNode.CurveTo(73.37258f, 204.0f, 68.0f, 198.62741f, 68.0f, 192.0f),
                    PathNode.LineTo(68.0f, 152.0f),
                    PathNode.CurveTo(68.0f, 145.37259f, 73.37258f, 140.0f, 80.0f, 140.0f),
                    PathNode.LineTo(216.0f, 140.0f),
                    PathNode.CurveTo(222.62741f, 140.0f, 228.0f, 145.37259f, 228.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 149.79086f, 218.20914f, 148.0f, 216.0f, 148.0f),
                    PathNode.LineTo(80.0f, 148.0f),
                    PathNode.CurveTo(77.79086f, 148.0f, 76.0f, 149.79086f, 76.0f, 152.0f),
                    PathNode.LineTo(76.0f, 192.0f),
                    PathNode.CurveTo(76.0f, 194.20914f, 77.79086f, 196.0f, 80.0f, 196.0f),
                    PathNode.LineTo(216.0f, 196.0f),
                    PathNode.CurveTo(218.20914f, 196.0f, 220.0f, 194.20914f, 220.0f, 192.0f),
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
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
