package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = phosphorThinIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.67f, 76.0f),
                    PathNode.LineTo(196.0f, 76.0f),
                    PathNode.LineTo(196.0f, 40.0f),
                    PathNode.CurveTo(196.0f, 37.79086f, 194.20914f, 36.0f, 192.0f, 36.0f),
                    PathNode.LineTo(64.0f, 36.0f),
                    PathNode.CurveTo(61.79086f, 36.0f, 60.0f, 37.79086f, 60.0f, 40.0f),
                    PathNode.LineTo(60.0f, 76.0f),
                    PathNode.LineTo(41.33f, 76.0f),
                    PathNode.CurveTo(29.57f, 76.0f, 20.0f, 85.0f, 20.0f, 96.0f),
                    PathNode.LineTo(20.0f, 176.0f),
                    PathNode.CurveTo(20.0f, 178.20914f, 21.790861f, 180.0f, 24.0f, 180.0f),
                    PathNode.LineTo(60.0f, 180.0f),
                    PathNode.LineTo(60.0f, 216.0f),
                    PathNode.CurveTo(60.0f, 218.20914f, 61.79086f, 220.0f, 64.0f, 220.0f),
                    PathNode.LineTo(192.0f, 220.0f),
                    PathNode.CurveTo(194.20914f, 220.0f, 196.0f, 218.20914f, 196.0f, 216.0f),
                    PathNode.LineTo(196.0f, 180.0f),
                    PathNode.LineTo(232.0f, 180.0f),
                    PathNode.CurveTo(234.20914f, 180.0f, 236.0f, 178.20914f, 236.0f, 176.0f),
                    PathNode.LineTo(236.0f, 96.0f),
                    PathNode.CurveTo(236.0f, 85.0f, 226.43f, 76.0f, 214.67f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 44.0f),
                    PathNode.LineTo(188.0f, 44.0f),
                    PathNode.LineTo(188.0f, 76.0f),
                    PathNode.LineTo(68.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 212.0f),
                    PathNode.LineTo(68.0f, 212.0f),
                    PathNode.LineTo(68.0f, 156.0f),
                    PathNode.LineTo(188.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 172.0f),
                    PathNode.LineTo(196.0f, 172.0f),
                    PathNode.LineTo(196.0f, 152.0f),
                    PathNode.CurveTo(196.0f, 149.79086f, 194.20914f, 148.0f, 192.0f, 148.0f),
                    PathNode.LineTo(64.0f, 148.0f),
                    PathNode.CurveTo(61.79086f, 148.0f, 60.0f, 149.79086f, 60.0f, 152.0f),
                    PathNode.LineTo(60.0f, 172.0f),
                    PathNode.LineTo(28.0f, 172.0f),
                    PathNode.LineTo(28.0f, 96.0f),
                    PathNode.CurveTo(28.0f, 89.38f, 34.0f, 84.0f, 41.33f, 84.0f),
                    PathNode.LineTo(214.67f, 84.0f),
                    PathNode.CurveTo(222.0f, 84.0f, 228.0f, 89.38f, 228.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 116.0f),
                    PathNode.CurveTo(196.0f, 120.41828f, 192.41827f, 124.0f, 188.0f, 124.0f),
                    PathNode.CurveTo(183.58173f, 124.0f, 180.0f, 120.41828f, 180.0f, 116.0f),
                    PathNode.CurveTo(180.0f, 111.58172f, 183.58173f, 108.0f, 188.0f, 108.0f),
                    PathNode.CurveTo(192.41827f, 108.0f, 196.0f, 111.58172f, 196.0f, 116.0f),
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
        return _printer!!
    }

private var _printer: ImageVector? = null
