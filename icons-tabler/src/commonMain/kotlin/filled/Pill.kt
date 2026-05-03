package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = tablerFilledIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.207f, 3.793f),
                    PathNode.CurveTo(22.53024f, 6.116555f, 22.53024f, 9.883446f, 20.207f, 12.207f),
                    PathNode.LineTo(12.207f, 20.207f),
                    PathNode.CurveTo(9.875811f, 22.48451f, 6.146221f, 22.462791f, 3.841715f, 20.158285f),
                    PathNode.CurveTo(1.537208f, 17.853779f, 1.515489f, 14.124189f, 3.793f, 11.793f),
                    PathNode.LineTo(11.793f, 3.793f),
                    PathNode.CurveTo(14.116554f, 1.469761f, 17.883446f, 1.469761f, 20.207f, 3.793f),
                    PathNode.MoveTo(13.207f, 5.207f),
                    PathNode.LineTo(8.913f, 9.5f),
                    PathNode.LineTo(14.499f, 15.086f),
                    PathNode.LineTo(18.793f, 10.794f),
                    PathNode.CurveTo(19.802805f, 9.798574f, 20.201582f, 8.338266f, 19.837864f, 6.967761f),
                    PathNode.CurveTo(19.474148f, 5.597257f, 18.403744f, 4.526853f, 17.03324f, 4.163136f),
                    PathNode.CurveTo(15.662735f, 3.799419f, 14.202425f, 4.198198f, 13.207f, 5.208f)
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
        return _pill!!
    }

private var _pill: ImageVector? = null
