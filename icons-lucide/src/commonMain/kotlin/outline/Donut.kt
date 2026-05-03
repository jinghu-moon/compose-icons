package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Donut: ImageVector
    get() {
        if (_donut != null) return _donut!!
        _donut = lucideOutlineIcon(
            name = "Donut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.5f, 10.0f),
                    PathNode.CurveTo(19.757986f, 9.985338f, 19.06084f, 9.641755f, 18.597218f, 9.062225f),
                    PathNode.CurveTo(18.133595f, 8.482697f, 17.951424f, 7.727135f, 18.1f, 7.0f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.CurveTo(16.945688f, 7.011096f, 15.965611f, 6.458651f, 15.429221f, 5.550915f),
                    PathNode.CurveTo(14.892832f, 4.64318f, 14.881692f, 3.51818f, 15.4f, 2.6f),
                    PathNode.CurveTo(11.09831f, 1.027256f, 6.278012f, 2.578008f, 3.700278f, 6.36395f),
                    PathNode.CurveTo(1.122544f, 10.149891f, 1.446385f, 15.203131f, 4.486295f, 18.629063f),
                    PathNode.CurveTo(7.526207f, 22.054993f, 12.505021f, 22.977762f, 16.570766f, 20.868786f),
                    PathNode.CurveTo(20.636513f, 18.75981f, 22.749762f, 14.158258f, 21.7f, 9.7f),
                    PathNode.CurveTo(21.4f, 9.9f, 20.9f, 10.0f, 20.5f, 10.0f)
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
                    PathNode.CurveTo(15.0f, 13.656855f, 13.656855f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(10.343145f, 15.0f, 9.0f, 13.656855f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 10.343145f, 10.343145f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(13.656855f, 9.0f, 15.0f, 10.343145f, 15.0f, 12.0f),
                    PathNode.Close
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
        return _donut!!
    }

private var _donut: ImageVector? = null
