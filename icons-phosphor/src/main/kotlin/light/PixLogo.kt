package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorLightIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.91f, 118.14f),
                    PathNode.LineTo(137.91f, 22.14f),
                    PathNode.CurveTo(135.29681f, 19.521494f, 131.74937f, 18.049984f, 128.05f, 18.049984f),
                    PathNode.CurveTo(124.35063f, 18.049984f, 120.80319f, 19.521494f, 118.19f, 22.14f),
                    PathNode.LineTo(22.19f, 118.19f),
                    PathNode.CurveTo(19.571493f, 120.80319f, 18.099985f, 124.35063f, 18.099985f, 128.05f),
                    PathNode.CurveTo(18.099985f, 131.74937f, 19.571493f, 135.29681f, 22.19f, 137.91f),
                    PathNode.LineTo(118.24f, 233.91f),
                    PathNode.CurveTo(120.85319f, 236.5285f, 124.40063f, 238.00002f, 128.1f, 238.00002f),
                    PathNode.CurveTo(131.79938f, 238.00002f, 135.3468f, 236.5285f, 137.96f, 233.91f),
                    PathNode.LineTo(233.96f, 137.91f),
                    PathNode.CurveTo(236.5785f, 135.29681f, 238.05002f, 131.74937f, 238.05002f, 128.05f),
                    PathNode.CurveTo(238.05002f, 124.35063f, 236.5785f, 120.80319f, 233.96f, 118.19f),
                    PathNode.Close,
                    PathNode.MoveTo(126.62f, 30.57f),
                    PathNode.CurveTo(127.39259f, 29.833492f, 128.6074f, 29.833492f, 129.38f, 30.57f),
                    PathNode.LineTo(188.81f, 90.0f),
                    PathNode.LineTo(160.0f, 90.0f),
                    PathNode.CurveTo(158.40924f, 90.0014f, 156.88414f, 90.63446f, 155.76f, 91.76f),
                    PathNode.LineTo(128.0f, 119.52f),
                    PathNode.LineTo(100.24f, 91.76f),
                    PathNode.CurveTo(99.11585f, 90.63446f, 97.59076f, 90.0014f, 96.0f, 90.0f),
                    PathNode.LineTo(67.19f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 128.0f),
                    PathNode.CurveTo(29.998287f, 127.482376f, 30.203505f, 126.985535f, 30.57f, 126.62f),
                    PathNode.LineTo(55.19f, 102.0f),
                    PathNode.LineTo(93.51f, 102.0f),
                    PathNode.LineTo(119.51f, 128.0f),
                    PathNode.LineTo(93.51f, 154.0f),
                    PathNode.LineTo(55.19f, 154.0f),
                    PathNode.LineTo(30.57f, 129.38f),
                    PathNode.CurveTo(30.203505f, 129.01447f, 29.998287f, 128.51762f, 30.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(129.38f, 225.43f),
                    PathNode.CurveTo(128.6074f, 226.16649f, 127.39259f, 226.16649f, 126.62f, 225.43f),
                    PathNode.LineTo(67.19f, 166.0f),
                    PathNode.LineTo(96.0f, 166.0f),
                    PathNode.CurveTo(97.59076f, 165.9986f, 99.11585f, 165.36554f, 100.24f, 164.24f),
                    PathNode.LineTo(128.0f, 136.48f),
                    PathNode.LineTo(155.76f, 164.24f),
                    PathNode.CurveTo(156.88414f, 165.36554f, 158.40924f, 165.9986f, 160.0f, 166.0f),
                    PathNode.LineTo(188.81f, 166.0f),
                    PathNode.Close,
                    PathNode.MoveTo(225.43f, 129.38f),
                    PathNode.LineTo(200.81f, 154.0f),
                    PathNode.LineTo(162.49f, 154.0f),
                    PathNode.LineTo(136.49f, 128.0f),
                    PathNode.LineTo(162.49f, 102.0f),
                    PathNode.LineTo(200.81f, 102.0f),
                    PathNode.LineTo(225.43f, 126.62f),
                    PathNode.CurveTo(226.16649f, 127.39259f, 226.16649f, 128.6074f, 225.43f, 129.38f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
