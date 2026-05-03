package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandZalando: ImageVector
    get() {
        if (_brandZalando != null) return _brandZalando!!
        _brandZalando = tablerOutlineIcon(
            name = "BrandZalando",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.531f, 21.0f),
                    PathNode.CurveTo(6.881f, 21.0f, 6.531f, 20.85f, 6.335f, 20.73f),
                    PathNode.CurveTo(6.069f, 20.573f, 5.582f, 20.167f, 5.138f, 18.983f),
                    PathNode.CurveTo(4.3588f, 16.738405f, 3.974118f, 14.375845f, 4.001f, 12.0f),
                    PathNode.CurveTo(4.016f, 9.255f, 4.437f, 6.93f, 5.138f, 5.025f),
                    PathNode.CurveTo(5.582f, 3.825f, 6.068f, 3.42f, 6.335f, 3.262f),
                    PathNode.CurveTo(6.527f, 3.159f, 6.88f, 3.0f, 7.53f, 3.0f),
                    PathNode.CurveTo(7.774f, 3.0f, 8.062001f, 3.022f, 8.401f, 3.075f),
                    PathNode.CurveTo(10.674953f, 3.503834f, 12.852012f, 4.342468f, 14.826f, 5.55f),
                    PathNode.LineTo(14.833f, 5.55f),
                    PathNode.CurveTo(16.850084f, 6.725327f, 18.640623f, 8.252045f, 20.12f, 10.058f),
                    PathNode.CurveTo(20.903f, 11.048f, 20.999f, 11.685f, 20.999f, 12.0f),
                    PathNode.CurveTo(20.999f, 12.315f, 20.903f, 12.953f, 20.12f, 13.943f),
                    PathNode.CurveTo(18.639938f, 15.746103f, 16.849438f, 17.270079f, 14.833f, 18.443f),
                    PathNode.LineTo(14.826f, 18.443f),
                    PathNode.CurveTo(12.852456f, 19.651224f, 10.675205f, 20.489594f, 8.401f, 20.917f),
                    PathNode.CurveTo(8.113643f, 20.970015f, 7.822199f, 20.997787f, 7.53f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandZalando!!
    }

private var _brandZalando: ImageVector? = null
