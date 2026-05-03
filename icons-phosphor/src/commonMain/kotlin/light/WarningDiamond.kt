package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WarningDiamond: ImageVector
    get() {
        if (_warningDiamond != null) return _warningDiamond!!
        _warningDiamond = phosphorLightIcon(
            name = "WarningDiamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(122.0f, 136.0f),
                    PathNode.LineTo(122.0f, 80.0f),
                    PathNode.CurveTo(122.0f, 76.686295f, 124.686295f, 74.0f, 128.0f, 74.0f),
                    PathNode.CurveTo(131.3137f, 74.0f, 134.0f, 76.686295f, 134.0f, 80.0f),
                    PathNode.LineTo(134.0f, 136.0f),
                    PathNode.CurveTo(134.0f, 139.3137f, 131.3137f, 142.0f, 128.0f, 142.0f),
                    PathNode.CurveTo(124.686295f, 142.0f, 122.0f, 139.3137f, 122.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 162.0f),
                    PathNode.CurveTo(122.47715f, 162.0f, 118.0f, 166.47716f, 118.0f, 172.0f),
                    PathNode.CurveTo(118.0f, 177.52284f, 122.47715f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(133.52284f, 182.0f, 138.0f, 177.52284f, 138.0f, 172.0f),
                    PathNode.CurveTo(138.0f, 166.47716f, 133.52284f, 162.0f, 128.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(238.0f, 128.0f),
                    PathNode.CurveTo(238.01224f, 131.7018f, 236.53886f, 135.25375f, 233.91f, 137.86f),
                    PathNode.LineTo(137.91f, 233.92f),
                    PathNode.CurveTo(132.45181f, 239.33488f, 123.648186f, 239.33488f, 118.19f, 233.92f),
                    PathNode.LineTo(118.19f, 233.92f),
                    PathNode.LineTo(22.19f, 137.86f),
                    PathNode.CurveTo(19.571493f, 135.24681f, 18.099985f, 131.69937f, 18.099985f, 128.0f),
                    PathNode.CurveTo(18.099985f, 124.30063f, 19.571493f, 120.75319f, 22.19f, 118.14f),
                    PathNode.LineTo(118.24f, 22.08f),
                    PathNode.CurveTo(123.69818f, 16.66511f, 132.50182f, 16.66511f, 137.96f, 22.08f),
                    PathNode.LineTo(233.96f, 118.14f),
                    PathNode.CurveTo(236.57051f, 120.75451f, 238.02547f, 124.305435f, 238.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 128.0f),
                    PathNode.CurveTo(226.00171f, 127.482376f, 225.7965f, 126.985535f, 225.43f, 126.62f),
                    PathNode.LineTo(129.38f, 30.56f),
                    PathNode.CurveTo(128.6074f, 29.823492f, 127.39259f, 29.823492f, 126.62f, 30.56f),
                    PathNode.LineTo(30.57f, 126.62f),
                    PathNode.CurveTo(29.833492f, 127.39259f, 29.833492f, 128.6074f, 30.57f, 129.38f),
                    PathNode.LineTo(126.62f, 225.44f),
                    PathNode.LineTo(126.62f, 225.44f),
                    PathNode.CurveTo(127.39259f, 226.17651f, 128.6074f, 226.17651f, 129.38f, 225.44f),
                    PathNode.LineTo(225.43f, 129.38f),
                    PathNode.CurveTo(225.7965f, 129.01447f, 226.00171f, 128.51762f, 226.0f, 128.0f),
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
        return _warningDiamond!!
    }

private var _warningDiamond: ImageVector? = null
