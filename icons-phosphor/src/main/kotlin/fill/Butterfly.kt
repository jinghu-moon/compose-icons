package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = phosphorFillIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 100.17f),
                    PathNode.CurveTo(125.62752f, 95.77751f, 122.95449f, 91.55412f, 120.0f, 87.53f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.CurveTo(120.0f, 51.581722f, 123.58172f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(132.41827f, 48.0f, 136.0f, 51.581722f, 136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 87.53f),
                    PathNode.CurveTo(133.0455f, 91.55412f, 130.37248f, 95.77751f, 128.0f, 100.17f),
                    PathNode.Close,
                    PathNode.MoveTo(232.7f, 50.48f),
                    PathNode.CurveTo(229.0f, 45.7f, 221.84f, 40.0f, 209.0f, 40.0f),
                    PathNode.CurveTo(192.15f, 40.0f, 170.54f, 51.28f, 151.19f, 70.16f),
                    PathNode.CurveTo(145.65755f, 75.52237f, 140.57698f, 81.332085f, 136.0f, 87.53f),
                    PathNode.LineTo(136.0f, 180.0f),
                    PathNode.CurveTo(136.0f, 184.41827f, 132.41827f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(123.58172f, 188.0f, 120.0f, 184.41827f, 120.0f, 180.0f),
                    PathNode.LineTo(120.0f, 87.53f),
                    PathNode.CurveTo(115.43576f, 81.33363f, 110.36861f, 75.52397f, 104.85f, 70.16f),
                    PathNode.CurveTo(85.49f, 51.28f, 63.88f, 40.0f, 47.0f, 40.0f),
                    PathNode.CurveTo(34.16f, 40.0f, 27.0f, 45.7f, 23.3f, 50.48f),
                    PathNode.CurveTo(16.48f, 59.25f, 11.12f, 74.56f, 23.09f, 121.68f),
                    PathNode.CurveTo(29.14f, 145.51f, 42.6f, 154.68f, 53.72f, 158.1f),
                    PathNode.CurveTo(41.10134f, 178.59001f, 47.283985f, 205.41629f, 67.59803f, 218.31631f),
                    PathNode.CurveTo(87.91208f, 231.21634f, 114.82107f, 225.40422f, 128.0f, 205.27f),
                    PathNode.CurveTo(141.17894f, 225.40422f, 168.08792f, 231.21634f, 188.40196f, 218.31631f),
                    PathNode.CurveTo(208.71602f, 205.41629f, 214.89867f, 178.59001f, 202.28f, 158.1f),
                    PathNode.CurveTo(213.4f, 154.7f, 226.85f, 145.51f, 232.91f, 121.68f),
                    PathNode.CurveTo(239.63f, 95.24f, 244.85f, 66.1f, 232.7f, 50.48f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
