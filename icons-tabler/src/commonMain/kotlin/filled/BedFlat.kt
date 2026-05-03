package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BedFlat: ImageVector
    get() {
        if (_bedFlat != null) return _bedFlat!!
        _bedFlat = tablerFilledIcon(
            name = "BedFlat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 8.0f),
                    PathNode.CurveTo(6.656854f, 8.0f, 8.0f, 9.343145f, 8.0f, 11.0f),
                    PathNode.CurveTo(8.0f, 12.656855f, 6.656854f, 14.0f, 5.0f, 14.0f),
                    PathNode.CurveTo(3.343146f, 14.0f, 2.0f, 12.656855f, 2.0f, 11.0f),
                    PathNode.LineTo(2.005f, 10.824f),
                    PathNode.CurveTo(2.098195f, 9.238178f, 3.411442f, 7.999912f, 5.0f, 8.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 7.0f),
                    PathNode.CurveTo(20.209139f, 7.0f, 22.0f, 8.790861f, 22.0f, 11.0f),
                    PathNode.LineTo(22.0f, 13.0f),
                    PathNode.CurveTo(22.0f, 13.552285f, 21.552284f, 14.0f, 21.0f, 14.0f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.CurveTo(9.447715f, 14.0f, 9.0f, 13.552285f, 9.0f, 13.0f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.CurveTo(9.0f, 7.447716f, 9.447715f, 7.0f, 10.0f, 7.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 15.0f),
                    PathNode.CurveTo(21.552284f, 15.0f, 22.0f, 15.447715f, 22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 16.552284f, 21.552284f, 17.0f, 21.0f, 17.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.CurveTo(2.447715f, 17.0f, 2.0f, 16.552284f, 2.0f, 16.0f),
                    PathNode.CurveTo(2.0f, 15.447715f, 2.447715f, 15.0f, 3.0f, 15.0f),
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
        return _bedFlat!!
    }

private var _bedFlat: ImageVector? = null
