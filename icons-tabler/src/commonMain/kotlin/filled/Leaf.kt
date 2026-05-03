package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = tablerFilledIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.055f, 14.328f),
                    PathNode.LineTo(3.037f, 14.16f),
                    PathNode.LineTo(3.033f, 14.117f),
                    PathNode.CurveTo(2.998309f, 13.744708f, 2.982622f, 13.37089f, 2.986f, 12.997f),
                    PathNode.CurveTo(3.004f, 6.707f, 7.276f, 3.0f, 15.986f, 3.0f),
                    PathNode.LineTo(20.0f, 3.0f),
                    PathNode.CurveTo(20.552284f, 3.0f, 21.0f, 3.447715f, 21.0f, 4.0f),
                    PathNode.LineTo(20.998f, 6.057f),
                    PathNode.CurveTo(20.5f, 14.758f, 16.258f, 19.0f, 9.0f, 19.0f),
                    PathNode.LineTo(6.369f, 19.0f),
                    PathNode.CurveTo(6.196985f, 19.694162f, 6.071704f, 20.399076f, 5.994f, 21.11f),
                    PathNode.CurveTo(5.933249f, 21.658972f, 5.438971f, 22.05475f, 4.89f, 21.994f),
                    PathNode.CurveTo(4.341029f, 21.933249f, 3.945249f, 21.43897f, 4.006f, 20.89f),
                    PathNode.QuadTo(4.18f, 19.322f, 4.586f, 17.943f),
                    PathNode.LineTo(4.468f, 17.797f),
                    PathNode.LineTo(4.26f, 17.517f),
                    PathNode.LineTo(4.103f, 17.288f),
                    PathNode.LineTo(3.921f, 16.995f),
                    PathNode.LineTo(3.823f, 16.824f),
                    PathNode.LineTo(3.758f, 16.702f),
                    PathNode.CurveTo(3.599163f, 16.400187f, 3.466348f, 16.08538f, 3.361f, 15.761f),
                    PathNode.LineTo(3.289f, 15.524f),
                    PathNode.LineTo(3.204f, 15.197f),
                    PathNode.LineTo(3.147f, 14.929f),
                    PathNode.LineTo(3.104f, 14.687f),
                    PathNode.Close,
                    PathNode.MoveTo(11.594f, 10.086f),
                    PathNode.CurveTo(8.749f, 11.351f, 6.74f, 13.216f, 5.486f, 15.669f),
                    PathNode.QuadTo(5.584f, 15.869f, 5.704f, 16.069f),
                    PathNode.LineTo(5.889f, 16.35f),
                    PathNode.LineTo(5.959f, 16.447f),
                    PathNode.QuadTo(6.079f, 16.611f, 6.217f, 16.776f),
                    PathNode.LineTo(6.414f, 17.0f),
                    PathNode.LineTo(7.063f, 17.0f),
                    PathNode.CurveTo(8.100001f, 14.729f, 9.84f, 13.054f, 12.406f, 11.914f),
                    PathNode.CurveTo(12.910789f, 11.689773f, 13.138227f, 11.098788f, 12.914f, 10.594f),
                    PathNode.CurveTo(12.689773f, 10.089211f, 12.098788f, 9.861773f, 11.594f, 10.086f)
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
