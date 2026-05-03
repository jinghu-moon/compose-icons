package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorRegularIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.87f, 114.0f),
                    PathNode.LineTo(63.87f, 18.11f),
                    PathNode.CurveTo(58.067635f, 14.843577f, 50.848835f, 15.512147f, 45.74506f, 19.788645f),
                    PathNode.CurveTo(40.641285f, 24.06514f, 38.71956f, 31.055494f, 40.92f, 37.34f),
                    PathNode.LineTo(71.55f, 128.0f),
                    PathNode.LineTo(40.92f, 218.67f),
                    PathNode.CurveTo(39.190266f, 223.56587f, 39.94391f, 228.99669f, 42.94143f, 233.23654f),
                    PathNode.CurveTo(45.93895f, 237.47641f, 50.80755f, 239.99802f, 56.0f, 240.0f),
                    PathNode.CurveTo(58.78002f, 239.99419f, 61.51147f, 239.27086f, 63.93f, 237.9f),
                    PathNode.LineTo(231.85f, 141.85f),
                    PathNode.CurveTo(236.89291f, 139.02509f, 240.02011f, 133.69984f, 240.03046f, 127.919624f),
                    PathNode.CurveTo(240.04083f, 122.1394f, 236.93275f, 116.80297f, 231.9f, 113.96f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 224.0f),
                    PathNode.CurveTo(56.0043f, 223.96011f, 56.0043f, 223.91989f, 56.0f, 223.88f),
                    PathNode.LineTo(85.74f, 136.0f),
                    PathNode.LineTo(144.0f, 136.0f),
                    PathNode.CurveTo(148.41827f, 136.0f, 152.0f, 132.41827f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 123.58172f, 148.41827f, 120.0f, 144.0f, 120.0f),
                    PathNode.LineTo(85.74f, 120.0f),
                    PathNode.LineTo(56.06f, 32.16f),
                    PathNode.CurveTo(56.050167f, 32.103386f, 56.029816f, 32.049118f, 56.0f, 32.0f),
                    PathNode.LineTo(224.0f, 127.83f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
