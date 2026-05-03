package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandEnvato: ImageVector
    get() {
        if (_brandEnvato != null) return _brandEnvato!!
        _brandEnvato = tablerOutlineIcon(
            name = "BrandEnvato",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.711f, 17.875f),
                    PathNode.CurveTo(4.177f, 16.536f, 3.361f, 13.697f, 4.84f, 11.405f),
                    PathNode.CurveTo(6.255f, 9.212f, 8.609f, 7.797f, 9.939f, 7.127f),
                    PathNode.LineTo(4.71f, 17.875f),
                    PathNode.LineTo(4.711f, 17.875f)
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
                    PathNode.MoveTo(19.715f, 12.508f),
                    PathNode.CurveTo(19.175f, 15.917f, 17.621f, 18.664f, 15.56f, 19.856f),
                    PathNode.CurveTo(11.491f, 22.209f, 7.416f, 20.306f, 6.263f, 19.668f),
                    PathNode.CurveTo(7.14f, 18.232f, 10.696f, 12.448f, 13.145f, 9.077f),
                    PathNode.CurveTo(15.859f, 5.34f, 19.009f, 3.099f, 19.71f, 3.0f),
                    PathNode.CurveTo(19.71f, 3.201f, 19.74f, 3.55f, 19.781f, 4.03f),
                    PathNode.CurveTo(19.925f, 5.739f, 20.224f, 9.294f, 19.715f, 12.508f)
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
        return _brandEnvato!!
    }

private var _brandEnvato: ImageVector? = null
