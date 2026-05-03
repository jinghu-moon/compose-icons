package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Melon: ImageVector
    get() {
        if (_melon != null) return _melon!!
        _melon = tablerFilledIcon(
            name = "Melon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.77f, 2.62f),
                    PathNode.CurveTo(16.965696f, 2.43273f, 17.228989f, 2.332856f, 17.499655f, 2.343223f),
                    PathNode.CurveTo(17.770317f, 2.35359f, 18.025202f, 2.47331f, 18.206f, 2.675f),
                    PathNode.CurveTo(20.00885f, 4.68892f, 21.00391f, 7.298016f, 21.0f, 10.001f),
                    PathNode.CurveTo(21.0f, 16.075f, 16.075f, 21.0f, 10.001f, 21.0f),
                    PathNode.CurveTo(7.129093f, 21.003674f, 4.370269f, 19.880972f, 2.317f, 17.873f),
                    PathNode.CurveTo(2.123124f, 17.6835f, 2.014495f, 17.423405f, 2.016003f, 17.152304f),
                    PathNode.CurveTo(2.017512f, 16.881203f, 2.129027f, 16.62233f, 2.325f, 16.435f),
                    PathNode.LineTo(6.668f, 12.282f),
                    PathNode.CurveTo(7.043358f, 11.923471f, 7.630628f, 11.911743f, 8.020001f, 12.255f),
                    PathNode.CurveTo(9.18872f, 13.286482f, 10.952682f, 13.251043f, 12.079029f, 12.173452f),
                    PathNode.CurveTo(13.205377f, 11.095861f, 13.318789f, 9.335192f, 12.34f, 8.122f),
                    PathNode.CurveTo(12.014299f, 7.71743f, 12.052534f, 7.130865f, 12.428f, 6.772f),
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
        return _melon!!
    }

private var _melon: ImageVector? = null
