package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOpenvpn: ImageVector
    get() {
        if (_brandOpenvpn != null) return _brandOpenvpn!!
        _brandOpenvpn = tablerOutlineIcon(
            name = "BrandOpenvpn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.618f, 20.243f),
                    PathNode.LineTo(13.425f, 14.641f),
                    PathNode.CurveTo(14.634145f, 13.988622f, 15.245598f, 12.598239f, 14.909166f, 11.266158f),
                    PathNode.CurveTo(14.572735f, 9.934076f, 13.37441f, 9.000772f, 12.0005f, 9.000772f),
                    PathNode.CurveTo(10.626591f, 9.000772f, 9.428265f, 9.934076f, 9.091833f, 11.266158f),
                    PathNode.CurveTo(8.755402f, 12.598239f, 9.366856f, 13.988622f, 10.576f, 14.641f),
                    PathNode.LineTo(8.383001f, 20.244f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 16.970562f, 7.029437f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(16.970562f, 21.0f, 21.0f, 16.970562f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 7.029437f, 16.970562f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.029437f, 3.0f, 3.0f, 7.029437f, 3.0f, 12.0f)
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
        return _brandOpenvpn!!
    }

private var _brandOpenvpn: ImageVector? = null
