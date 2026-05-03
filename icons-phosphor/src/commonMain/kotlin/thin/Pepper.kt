package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = phosphorThinIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(163.79f, 44.14f),
                    PathNode.CurveTo(161.79231f, 25.87216f, 146.37672f, 12.028693f, 128.0f, 12.0f),
                    PathNode.CurveTo(125.79086f, 12.0f, 124.0f, 13.790861f, 124.0f, 16.0f),
                    PathNode.CurveTo(124.0f, 18.209139f, 125.79086f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(141.98141f, 20.003405f, 153.81754f, 30.319998f, 155.73f, 44.17f),
                    PathNode.CurveTo(124.35232f, 46.442917f, 100.04348f, 72.54014f, 100.0f, 104.0f),
                    PathNode.CurveTo(100.0f, 152.75f, 73.29f, 185.34f, 20.6f, 200.87f),
                    PathNode.CurveTo(15.22185f, 202.4244f, 11.633074f, 207.49106f, 11.951296f, 213.08028f),
                    PathNode.CurveTo(12.269518f, 218.6695f, 16.410177f, 223.29607f, 21.93f, 224.23f),
                    PathNode.CurveTo(36.713573f, 226.77345f, 51.689266f, 228.03482f, 66.69f, 228.0f),
                    PathNode.CurveTo(78.33875f, 228.02502f, 89.975685f, 227.25658f, 101.52f, 225.7f),
                    PathNode.CurveTo(134.75f, 221.11f, 161.72f, 210.29f, 181.71f, 193.52f),
                    PathNode.CurveTo(207.12f, 172.21f, 220.0f, 142.09f, 220.0f, 104.0f),
                    PathNode.CurveTo(219.95477f, 72.355965f, 195.36867f, 46.173363f, 163.79f, 44.14f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 52.0f),
                    PathNode.CurveTo(183.48306f, 52.03251f, 204.0397f, 67.77662f, 210.19f, 90.44f),
                    PathNode.LineTo(192.0f, 99.54f),
                    PathNode.LineTo(161.79f, 84.43f),
                    PathNode.CurveTo(160.66327f, 83.86618f, 159.33673f, 83.86618f, 158.21f, 84.43f),
                    PathNode.LineTo(128.0f, 99.54f),
                    PathNode.LineTo(109.81f, 90.44f),
                    PathNode.CurveTo(115.96031f, 67.77662f, 136.51694f, 52.03251f, 160.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.57f, 187.39f),
                    PathNode.CurveTo(151.1f, 208.76f, 95.69f, 229.16f, 23.33f, 216.39f),
                    PathNode.CurveTo(21.4635f, 216.10797f, 20.048227f, 214.55946f, 19.934834f, 212.67517f),
                    PathNode.CurveTo(19.82144f, 210.7909f, 21.040792f, 209.08382f, 22.86f, 208.58f),
                    PathNode.CurveTo(78.56f, 192.14f, 108.0f, 156.0f, 108.0f, 104.0f),
                    PathNode.CurveTo(108.00221f, 102.19976f, 108.095665f, 100.40078f, 108.28f, 98.61f),
                    PathNode.LineTo(126.21f, 107.61f),
                    PathNode.CurveTo(127.33674f, 108.17382f, 128.66327f, 108.17382f, 129.79f, 107.61f),
                    PathNode.LineTo(160.0f, 92.48f),
                    PathNode.LineTo(190.21f, 107.59f),
                    PathNode.CurveTo(191.33673f, 108.15382f, 192.66327f, 108.15382f, 193.79f, 107.59f),
                    PathNode.LineTo(211.72f, 98.59f),
                    PathNode.CurveTo(211.90501f, 100.38742f, 211.99846f, 102.193085f, 212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 139.62f, 200.08f, 167.67f, 176.57f, 187.39f),
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
