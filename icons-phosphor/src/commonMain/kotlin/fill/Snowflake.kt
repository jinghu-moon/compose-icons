package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Snowflake: ImageVector
    get() {
        if (_snowflake != null) return _snowflake!!
        _snowflake = phosphorFillIcon(
            name = "Snowflake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.37f, 143.22f),
                    PathNode.LineTo(189.31f, 136.46f),
                    PathNode.CurveTo(193.47423f, 134.97435f, 198.05435f, 137.14577f, 199.54f, 141.31f),
                    PathNode.CurveTo(201.02565f, 145.47423f, 198.85423f, 150.05435f, 194.69f, 151.54f),
                    PathNode.LineTo(179.21f, 157.06f),
                    PathNode.LineTo(183.73f, 173.93f),
                    PathNode.CurveTo(184.27965f, 175.98015f, 183.99205f, 178.16469f, 182.9305f, 180.00272f),
                    PathNode.CurveTo(181.86894f, 181.84076f, 180.12047f, 183.18156f, 178.07f, 183.73f),
                    PathNode.CurveTo(177.39426f, 183.9075f, 176.69867f, 183.99823f, 176.0f, 184.0f),
                    PathNode.CurveTo(172.37804f, 184.00111f, 169.20718f, 181.56862f, 168.27f, 178.07f),
                    PathNode.LineTo(162.7f, 157.27f),
                    PathNode.LineTo(136.0f, 141.86f),
                    PathNode.LineTo(136.0f, 172.69f),
                    PathNode.LineTo(149.66f, 186.34f),
                    PathNode.CurveTo(152.78593f, 189.46593f, 152.78593f, 194.53407f, 149.66f, 197.66f),
                    PathNode.CurveTo(146.53407f, 200.78593f, 141.46593f, 200.78593f, 138.34f, 197.66f),
                    PathNode.LineTo(128.0f, 187.31f),
                    PathNode.LineTo(117.66f, 197.66f),
                    PathNode.CurveTo(114.534065f, 200.78593f, 109.465935f, 200.78593f, 106.34f, 197.66f),
                    PathNode.CurveTo(103.214066f, 194.53407f, 103.214066f, 189.46593f, 106.34f, 186.34f),
                    PathNode.LineTo(120.0f, 172.69f),
                    PathNode.LineTo(120.0f, 141.86f),
                    PathNode.LineTo(93.3f, 157.27f),
                    PathNode.LineTo(87.73f, 178.07f),
                    PathNode.CurveTo(86.792816f, 181.56862f, 83.62196f, 184.00111f, 80.0f, 184.0f),
                    PathNode.CurveTo(79.30134f, 183.99823f, 78.60574f, 183.9075f, 77.93f, 183.73f),
                    PathNode.CurveTo(75.879524f, 183.18156f, 74.13106f, 181.84076f, 73.0695f, 180.00272f),
                    PathNode.CurveTo(72.00796f, 178.16469f, 71.720345f, 175.98015f, 72.27f, 173.93f),
                    PathNode.LineTo(76.79f, 157.06f),
                    PathNode.LineTo(61.31f, 151.54f),
                    PathNode.CurveTo(57.145775f, 150.05435f, 54.974354f, 145.47423f, 56.46f, 141.31f),
                    PathNode.CurveTo(57.945644f, 137.14577f, 62.525772f, 134.97435f, 66.69f, 136.46f),
                    PathNode.LineTo(85.63f, 143.22f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.LineTo(85.63f, 112.78f),
                    PathNode.LineTo(66.69f, 119.54f),
                    PathNode.CurveTo(65.82542f, 119.84288f, 64.9161f, 119.998375f, 64.0f, 120.0f),
                    PathNode.CurveTo(60.10201f, 120.00798f, 56.765694f, 117.205414f, 56.100834f, 113.36455f),
                    PathNode.CurveTo(55.435966f, 109.52366f, 57.636127f, 105.76271f, 61.31f, 104.46f),
                    PathNode.LineTo(76.79f, 98.94f),
                    PathNode.LineTo(72.27f, 82.07f),
                    PathNode.CurveTo(71.12677f, 77.80084f, 73.660835f, 73.41323f, 77.93f, 72.27f),
                    PathNode.CurveTo(82.19916f, 71.12677f, 86.58677f, 73.660835f, 87.73f, 77.93f),
                    PathNode.LineTo(93.3f, 98.73f),
                    PathNode.LineTo(120.0f, 114.14f),
                    PathNode.LineTo(120.0f, 83.31f),
                    PathNode.LineTo(106.34f, 69.66f),
                    PathNode.CurveTo(103.214066f, 66.534065f, 103.214066f, 61.46593f, 106.34f, 58.34f),
                    PathNode.CurveTo(109.465935f, 55.21407f, 114.534065f, 55.21407f, 117.66f, 58.34f),
                    PathNode.LineTo(128.0f, 68.69f),
                    PathNode.LineTo(138.34f, 58.34f),
                    PathNode.CurveTo(141.46593f, 55.21407f, 146.53407f, 55.21407f, 149.66f, 58.34f),
                    PathNode.CurveTo(152.78593f, 61.46593f, 152.78593f, 66.534065f, 149.66f, 69.66f),
                    PathNode.LineTo(136.0f, 83.31f),
                    PathNode.LineTo(136.0f, 114.14f),
                    PathNode.LineTo(162.7f, 98.73f),
                    PathNode.LineTo(168.27f, 77.93f),
                    PathNode.CurveTo(169.41322f, 73.660835f, 173.80084f, 71.12677f, 178.07f, 72.27f),
                    PathNode.CurveTo(182.33916f, 73.41323f, 184.87323f, 77.80084f, 183.73f, 82.07f),
                    PathNode.LineTo(179.21f, 98.94f),
                    PathNode.LineTo(194.69f, 104.46f),
                    PathNode.CurveTo(198.36388f, 105.76271f, 200.56403f, 109.52366f, 199.89917f, 113.36455f),
                    PathNode.CurveTo(199.23431f, 117.205414f, 195.898f, 120.00798f, 192.0f, 120.0f),
                    PathNode.CurveTo(191.08391f, 119.998375f, 190.17458f, 119.84288f, 189.31f, 119.54f),
                    PathNode.LineTo(170.37f, 112.78f),
                    PathNode.LineTo(144.0f, 128.0f),
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
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
