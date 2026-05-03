package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacCancer: ImageVector
    get() {
        if (_zodiacCancer != null) return _zodiacCancer!!
        _zodiacCancer = tablerOutlineIcon(
            name = "ZodiacCancer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 13.656855f, 4.343146f, 15.0f, 6.0f, 15.0f),
                    PathNode.CurveTo(7.656854f, 15.0f, 9.0f, 13.656855f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 10.343145f, 7.656854f, 9.0f, 6.0f, 9.0f),
                    PathNode.CurveTo(4.343146f, 9.0f, 3.0f, 10.343145f, 3.0f, 12.0f)
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
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 13.656855f, 16.343145f, 15.0f, 18.0f, 15.0f),
                    PathNode.CurveTo(19.656855f, 15.0f, 21.0f, 13.656855f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 10.343145f, 19.656855f, 9.0f, 18.0f, 9.0f),
                    PathNode.CurveTo(16.343145f, 9.0f, 15.0f, 10.343145f, 15.0f, 12.0f)
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
                    PathNode.CurveTo(2.699538f, 9.712717f, 4.277499f, 7.492035f, 7.151363f, 6.15774f),
                    PathNode.CurveTo(10.025227f, 4.823447f, 13.768761f, 4.573435f, 17.0f, 5.5f)
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
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.300463f, 14.287283f, 19.722502f, 16.507965f, 16.848637f, 17.84226f),
                    PathNode.CurveTo(13.974773f, 19.176554f, 10.231239f, 19.426565f, 7.0f, 18.5f)
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
        return _zodiacCancer!!
    }

private var _zodiacCancer: ImageVector? = null
