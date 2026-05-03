package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mushroom: ImageVector
    get() {
        if (_mushroom != null) return _mushroom!!
        _mushroom = tablerFilledIcon(
            name = "Mushroom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.CurveTo(15.001565f, 20.623695f, 13.711033f, 21.95395f, 12.088037f, 22.001598f),
                    PathNode.CurveTo(10.465041f, 22.049248f, 9.098692f, 20.79699f, 9.005f, 19.176f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.Close,
                    PathNode.MoveTo(4.9f, 13.0f),
                    PathNode.CurveTo(3.908146f, 12.999882f, 3.08326f, 12.23684f, 3.006f, 11.248f),
                    PathNode.LineTo(3.0f, 11.1f),
                    PathNode.CurveTo(3.0f, 6.077f, 7.027f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(16.973f, 2.0f, 21.0f, 6.077f, 21.0f, 11.1f),
                    PathNode.CurveTo(20.999882f, 12.091854f, 20.23684f, 12.916739f, 19.248f, 12.994f),
                    PathNode.LineTo(19.1f, 13.0f),
                    PathNode.LineTo(4.9f, 13.0f),
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
        return _mushroom!!
    }

private var _mushroom: ImageVector? = null
