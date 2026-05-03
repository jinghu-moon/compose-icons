package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PyramidOff: ImageVector
    get() {
        if (_pyramidOff != null) return _pyramidOff!!
        _pyramidOff = tablerOutlineIcon(
            name = "PyramidOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.384f, 17.373f),
                    PathNode.CurveTo(21.59489f, 17.038506f, 21.5898f, 16.611376f, 21.371f, 16.282f),
                    PathNode.LineTo(12.831f, 2.446f),
                    PathNode.CurveTo(12.645836f, 2.167402f, 12.333519f, 1.999971f, 11.999f, 1.999971f),
                    PathNode.CurveTo(11.664481f, 1.999971f, 11.352164f, 2.167402f, 11.167f, 2.446f),
                    PathNode.LineTo(9.367f, 5.363f),
                    PathNode.MoveTo(7.836f, 7.843f),
                    PathNode.LineTo(2.627f, 16.282f),
                    PathNode.CurveTo(2.468599f, 16.521452f, 2.420171f, 16.817217f, 2.493933f, 17.094683f),
                    PathNode.CurveTo(2.567694f, 17.372147f, 2.756602f, 17.604818f, 3.013f, 17.734f),
                    PathNode.LineTo(11.105f, 21.788f),
                    PathNode.CurveTo(11.667871f, 22.070524f, 12.331129f, 22.070524f, 12.894f, 21.788f),
                    PathNode.LineTo(18.797f, 18.83f)
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
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _pyramidOff!!
    }

private var _pyramidOff: ImageVector? = null
