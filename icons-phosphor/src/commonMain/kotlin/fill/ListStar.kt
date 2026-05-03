package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ListStar: ImageVector
    get() {
        if (_listStar != null) return _listStar!!
        _listStar = phosphorFillIcon(
            name = "ListStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(196.41827f, 72.0f, 200.0f, 75.58172f, 200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 84.41828f, 196.41827f, 88.0f, 192.0f, 88.0f),
                    PathNode.LineTo(64.0f, 88.0f),
                    PathNode.CurveTo(59.581722f, 88.0f, 56.0f, 84.41828f, 56.0f, 80.0f),
                    PathNode.CurveTo(56.0f, 75.58172f, 59.581722f, 72.0f, 64.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(100.41828f, 120.0f, 104.0f, 123.58172f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 132.41827f, 100.41828f, 136.0f, 96.0f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.CurveTo(59.581722f, 136.0f, 56.0f, 132.41827f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 123.58172f, 59.581722f, 120.0f, 64.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 184.0f),
                    PathNode.LineTo(64.0f, 184.0f),
                    PathNode.CurveTo(59.581722f, 184.0f, 56.0f, 180.41827f, 56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 171.58173f, 59.581722f, 168.0f, 64.0f, 168.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.CurveTo(108.41828f, 168.0f, 112.0f, 171.58173f, 112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 180.41827f, 108.41828f, 184.0f, 104.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(198.55f, 143.29f),
                    PathNode.LineTo(180.69f, 158.0f),
                    PathNode.LineTo(186.13f, 180.0f),
                    PathNode.CurveTo(186.5182f, 181.56322f, 185.93094f, 183.20677f, 184.64f, 184.17f),
                    PathNode.CurveTo(183.94745f, 184.68051f, 183.11035f, 184.95721f, 182.25f, 184.96f),
                    PathNode.CurveTo(181.54657f, 184.95572f, 180.8567f, 184.766f, 180.25f, 184.41f),
                    PathNode.LineTo(160.0f, 172.54f),
                    PathNode.LineTo(139.78f, 184.45f),
                    PathNode.CurveTo(138.39227f, 185.26591f, 136.65067f, 185.17043f, 135.36046f, 184.20769f),
                    PathNode.CurveTo(134.07025f, 183.24495f, 133.48291f, 181.60258f, 133.87f, 180.04f),
                    PathNode.LineTo(139.31f, 158.04f),
                    PathNode.LineTo(121.45f, 143.29f),
                    PathNode.CurveTo(120.19406f, 142.25096f, 119.69424f, 140.55376f, 120.18656f, 138.99985f),
                    PathNode.CurveTo(120.67889f, 137.44595f, 122.064865f, 136.34622f, 123.69f, 136.22f),
                    PathNode.LineTo(147.27f, 134.4f),
                    PathNode.LineTo(156.33f, 113.4f),
                    PathNode.CurveTo(156.96402f, 111.93744f, 158.40593f, 110.990944f, 160.0f, 110.990944f),
                    PathNode.CurveTo(161.59407f, 110.990944f, 163.03598f, 111.93744f, 163.67f, 113.4f),
                    PathNode.LineTo(172.73f, 134.4f),
                    PathNode.LineTo(196.31f, 136.22f),
                    PathNode.CurveTo(197.93513f, 136.34622f, 199.32112f, 137.44595f, 199.81345f, 138.99985f),
                    PathNode.CurveTo(200.30577f, 140.55376f, 199.80594f, 142.25096f, 198.55f, 143.29f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _listStar!!
    }

private var _listStar: ImageVector? = null
