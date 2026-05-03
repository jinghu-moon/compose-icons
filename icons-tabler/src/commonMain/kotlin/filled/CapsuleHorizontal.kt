package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CapsuleHorizontal: ImageVector
    get() {
        if (_capsuleHorizontal != null) return _capsuleHorizontal!!
        _capsuleHorizontal = tablerFilledIcon(
            name = "CapsuleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 5.0f),
                    PathNode.LineTo(9.0f, 5.0f),
                    PathNode.CurveTo(5.134007f, 5.0f, 2.0f, 8.134007f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 15.865993f, 5.134007f, 19.0f, 9.0f, 19.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.CurveTo(18.865993f, 19.0f, 22.0f, 15.865993f, 22.0f, 12.0f),
                    PathNode.LineTo(21.993f, 11.697f),
                    PathNode.CurveTo(21.830767f, 7.952532f, 18.747982f, 5.000235f, 15.0f, 5.0f),
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
        return _capsuleHorizontal!!
    }

private var _capsuleHorizontal: ImageVector? = null
