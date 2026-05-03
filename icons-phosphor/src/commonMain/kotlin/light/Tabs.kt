package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorLightIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(253.75f, 166.28f),
                    PathNode.LineTo(253.75f, 166.28f),
                    PathNode.LineTo(253.75f, 166.28f),
                    PathNode.LineTo(253.75f, 166.28f),
                    PathNode.LineTo(231.46f, 92.0f),
                    PathNode.CurveTo(229.71759f, 86.05099f, 224.24887f, 81.9729f, 218.05f, 82.0f),
                    PathNode.LineTo(208.0f, 82.0f),
                    PathNode.CurveTo(204.6863f, 82.0f, 202.0f, 84.686295f, 202.0f, 88.0f),
                    PathNode.CurveTo(202.0f, 91.313705f, 204.6863f, 94.0f, 208.0f, 94.0f),
                    PathNode.LineTo(218.05f, 94.0f),
                    PathNode.CurveTo(218.94443f, 93.98396f, 219.74072f, 94.563835f, 220.0f, 95.42f),
                    PathNode.LineTo(240.0f, 162.0f),
                    PathNode.LineTo(204.46f, 162.0f),
                    PathNode.LineTo(183.46f, 92.0f),
                    PathNode.CurveTo(181.71759f, 86.05099f, 176.24887f, 81.9729f, 170.05f, 82.0f),
                    PathNode.LineTo(160.0f, 82.0f),
                    PathNode.CurveTo(156.6863f, 82.0f, 154.0f, 84.686295f, 154.0f, 88.0f),
                    PathNode.CurveTo(154.0f, 91.313705f, 156.6863f, 94.0f, 160.0f, 94.0f),
                    PathNode.LineTo(170.05f, 94.0f),
                    PathNode.CurveTo(170.94443f, 93.98396f, 171.74072f, 94.563835f, 172.0f, 95.42f),
                    PathNode.LineTo(192.0f, 162.0f),
                    PathNode.LineTo(156.46f, 162.0f),
                    PathNode.LineTo(135.46f, 92.0f),
                    PathNode.CurveTo(133.71759f, 86.05099f, 128.24887f, 81.9729f, 122.05f, 82.0f),
                    PathNode.LineTo(38.0f, 82.0f),
                    PathNode.CurveTo(31.782644f, 81.950516f, 26.287512f, 86.03308f, 24.54f, 92.0f),
                    PathNode.LineTo(2.28f, 166.2f),
                    PathNode.LineTo(2.28f, 166.25f),
                    PathNode.LineTo(2.28f, 166.25f),
                    PathNode.LineTo(2.28f, 166.4f),
                    PathNode.CurveTo(2.237318f, 166.52742f, 2.203898f, 166.65776f, 2.18f, 166.79f),
                    PathNode.CurveTo(2.176162f, 166.80644f, 2.176162f, 166.82355f, 2.18f, 166.84f),
                    PathNode.CurveTo(1.835183f, 168.58931f, 2.28622f, 170.40134f, 3.410838f, 171.78491f),
                    PathNode.CurveTo(4.535455f, 173.16846f, 6.217143f, 173.98018f, 8.0f, 174.0f),
                    PathNode.LineTo(248.0f, 174.0f),
                    PathNode.CurveTo(249.89621f, 174.00058f, 251.68109f, 173.10477f, 252.81375f, 171.58403f),
                    PathNode.CurveTo(253.94643f, 170.0633f, 254.29358f, 168.09662f, 253.75f, 166.28f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 95.42f),
                    PathNode.CurveTo(36.264103f, 94.54543f, 37.08726f, 93.96099f, 38.0f, 94.0f),
                    PathNode.LineTo(122.1f, 94.0f),
                    PathNode.CurveTo(122.978714f, 94.0075f, 123.749596f, 94.58769f, 124.0f, 95.43f),
                    PathNode.LineTo(144.0f, 162.0f),
                    PathNode.LineTo(16.06f, 162.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tabs!!
    }

private var _tabs: ImageVector? = null
