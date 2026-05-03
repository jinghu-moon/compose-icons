package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = phosphorBoldIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.26f, 36.77f),
                    PathNode.CurveTo(196.89148f, 14.40487f, 160.62852f, 14.40487f, 138.26f, 36.77f),
                    PathNode.LineTo(36.77f, 138.26f),
                    PathNode.CurveTo(14.402468f, 160.62753f, 14.402469f, 196.89247f, 36.77f, 219.26f),
                    PathNode.CurveTo(59.13753f, 241.62753f, 95.402466f, 241.62753f, 117.77f, 219.26f),
                    PathNode.LineTo(219.26f, 117.74f),
                    PathNode.CurveTo(241.5776f, 95.36352f, 241.5776f, 59.14648f, 219.26f, 36.77f),
                    PathNode.Close,
                    PathNode.MoveTo(100.78f, 202.26f),
                    PathNode.CurveTo(92.503426f, 211.2182f, 79.98765f, 214.92789f, 68.16631f, 211.92673f),
                    PathNode.CurveTo(56.34498f, 208.92558f, 47.11442f, 199.69502f, 44.113262f, 187.87367f),
                    PathNode.CurveTo(41.11211f, 176.05235f, 44.821804f, 163.53658f, 53.78f, 155.26f),
                    PathNode.LineTo(96.0f, 113.0f),
                    PathNode.LineTo(143.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.28f, 100.77f),
                    PathNode.LineTo(160.0f, 143.0f),
                    PathNode.LineTo(113.0f, 96.0f),
                    PathNode.LineTo(155.27f, 53.74f),
                    PathNode.CurveTo(168.3864f, 41.621616f, 188.7317f, 42.02378f, 201.35896f, 54.651035f),
                    PathNode.CurveTo(213.98622f, 67.27829f, 214.38838f, 87.6236f, 202.27f, 100.74f),
                    PathNode.Close,
                    PathNode.MoveTo(192.51f, 75.51f),
                    PathNode.CurveTo(194.76945f, 77.76162f, 196.03946f, 80.82018f, 196.03946f, 84.01f),
                    PathNode.CurveTo(196.03946f, 87.19982f, 194.76945f, 90.25838f, 192.51f, 92.51f),
                    PathNode.LineTo(168.51f, 116.51f),
                    PathNode.CurveTo(163.81558f, 121.20442f, 156.20442f, 121.20442f, 151.51f, 116.51f),
                    PathNode.CurveTo(146.81558f, 111.81558f, 146.81558f, 104.20442f, 151.51f, 99.51f),
                    PathNode.LineTo(175.51f, 75.51f),
                    PathNode.CurveTo(177.76163f, 73.25055f, 180.82018f, 71.98054f, 184.01f, 71.98054f),
                    PathNode.CurveTo(187.19981f, 71.98054f, 190.25838f, 73.25055f, 192.51f, 75.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pill!!
    }

private var _pill: ImageVector? = null
