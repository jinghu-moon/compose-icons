package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Id: ImageVector
    get() {
        if (_id != null) return _id!!
        _id = tablerFilledIcon(
            name = "Id",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.CurveTo(20.209139f, 3.0f, 22.0f, 4.790861f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 19.209139f, 20.209139f, 21.0f, 18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(3.790861f, 21.0f, 2.0f, 19.209139f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.QuadTo(2.0f, 6.947f, 2.005f, 6.898f),
                    PathNode.CurveTo(2.05714f, 4.729366f, 3.830739f, 2.99883f, 6.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(17.0f, 15.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.CurveTo(6.447716f, 15.0f, 6.0f, 15.447715f, 6.0f, 16.0f),
                    PathNode.CurveTo(6.0f, 16.552284f, 6.447716f, 17.0f, 7.0f, 17.0f),
                    PathNode.LineTo(17.0f, 17.0f),
                    PathNode.CurveTo(17.552284f, 17.0f, 18.0f, 16.552284f, 18.0f, 16.0f),
                    PathNode.CurveTo(18.0f, 15.447715f, 17.552284f, 15.0f, 17.0f, 15.0f),
                    PathNode.MoveTo(9.0f, 7.0f),
                    PathNode.CurveTo(7.38306f, 6.999152f, 6.057369f, 8.281907f, 6.005f, 9.898f),
                    PathNode.CurveTo(6.001598f, 9.931892f, 5.999929f, 9.965937f, 6.0f, 10.0f),
                    PathNode.CurveTo(6.0f, 11.656855f, 7.343146f, 13.0f, 9.0f, 13.0f),
                    PathNode.CurveTo(10.656855f, 13.0f, 12.0f, 11.656855f, 12.0f, 10.0f),
                    PathNode.CurveTo(12.0f, 8.343146f, 10.656855f, 7.0f, 9.0f, 7.0f),
                    PathNode.MoveTo(17.0f, 11.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(14.447715f, 11.0f, 14.0f, 11.447715f, 14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 12.552285f, 14.447715f, 13.0f, 15.0f, 13.0f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.CurveTo(17.552284f, 13.0f, 18.0f, 12.552285f, 18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 11.447715f, 17.552284f, 11.0f, 17.0f, 11.0f),
                    PathNode.MoveTo(17.0f, 7.0f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.CurveTo(14.447715f, 7.0f, 14.0f, 7.447716f, 14.0f, 8.0f),
                    PathNode.CurveTo(14.0f, 8.552285f, 14.447715f, 9.0f, 15.0f, 9.0f),
                    PathNode.LineTo(17.0f, 9.0f),
                    PathNode.CurveTo(17.552284f, 9.0f, 18.0f, 8.552285f, 18.0f, 8.0f),
                    PathNode.CurveTo(18.0f, 7.447716f, 17.552284f, 7.0f, 17.0f, 7.0f)
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
        return _id!!
    }

private var _id: ImageVector? = null
