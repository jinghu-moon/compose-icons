package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Droplets: ImageVector
    get() {
        if (_droplets != null) return _droplets!!
        _droplets = tablerFilledIcon(
            name = "Droplets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 12.003f),
                    PathNode.CurveTo(6.541f, 12.003f, 7.045f, 12.276f, 7.342f, 12.73f),
                    PathNode.LineTo(9.464f, 16.003f),
                    PathNode.CurveTo(10.435979f, 17.684025f, 10.05989f, 19.82035f, 8.572268f, 21.068375f),
                    PathNode.CurveTo(7.084646f, 22.3164f, 4.915469f, 22.3154f, 3.429f, 21.066f),
                    PathNode.CurveTo(1.942f, 19.818f, 1.565f, 17.684f, 2.562f, 15.956f),
                    PathNode.LineTo(4.66f, 12.73f),
                    PathNode.CurveTo(4.95509f, 12.276769f, 5.459171f, 12.003286f, 6.0f, 12.003f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 12.003f),
                    PathNode.CurveTo(18.541f, 12.003f, 19.045f, 12.276f, 19.342f, 12.73f),
                    PathNode.LineTo(21.464f, 16.003f),
                    PathNode.CurveTo(22.435978f, 17.684025f, 22.05989f, 19.82035f, 20.572268f, 21.068375f),
                    PathNode.CurveTo(19.084646f, 22.3164f, 16.915468f, 22.3154f, 15.429f, 21.066f),
                    PathNode.CurveTo(13.942f, 19.818f, 13.565f, 17.684f, 14.562f, 15.956f),
                    PathNode.LineTo(16.66f, 12.729f),
                    PathNode.CurveTo(16.955322f, 12.276151f, 17.459362f, 12.003066f, 18.0f, 12.003f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.003f),
                    PathNode.CurveTo(12.541f, 2.003f, 13.045f, 2.276f, 13.342f, 2.73f),
                    PathNode.LineTo(15.464f, 6.003f),
                    PathNode.CurveTo(16.435978f, 7.684025f, 16.05989f, 9.82035f, 14.572268f, 11.068375f),
                    PathNode.CurveTo(13.084645f, 12.316401f, 10.915469f, 12.315398f, 9.429f, 11.066f),
                    PathNode.CurveTo(7.942f, 9.818f, 7.565f, 7.684f, 8.562f, 5.956f),
                    PathNode.LineTo(10.66f, 2.73f),
                    PathNode.CurveTo(10.95509f, 2.276769f, 11.45917f, 2.003286f, 12.0f, 2.003f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _droplets!!
    }

private var _droplets: ImageVector? = null
