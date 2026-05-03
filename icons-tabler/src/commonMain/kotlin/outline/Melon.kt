package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Melon: ImageVector
    get() {
        if (_melon != null) return _melon!!
        _melon = tablerOutlineIcon(
            name = "Melon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 10.0f),
                    PathNode.CurveTo(20.0f, 15.523f, 15.523f, 20.0f, 10.0f, 20.0f),
                    PathNode.CurveTo(7.389663f, 20.003765f, 4.882023f, 18.983332f, 3.016f, 17.158f),
                    PathNode.LineTo(7.359f, 13.005f),
                    PathNode.CurveTo(8.917361f, 14.378652f, 11.267877f, 14.33077f, 12.769005f, 12.894796f),
                    PathNode.CurveTo(14.270132f, 11.458821f, 14.422197f, 9.112741f, 13.119f, 7.495f),
                    PathNode.LineTo(17.461f, 3.342f),
                    PathNode.CurveTo(19.099182f, 5.17244f, 20.003395f, 7.543552f, 20.0f, 10.0f)
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
        return _melon!!
    }

private var _melon: ImageVector? = null
