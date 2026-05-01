package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeCc: ImageVector
    get() {
        if (_badgeCc != null) return _badgeCc!!
        _badgeCc = tablerFilledIcon(
            name = "BadgeCc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(20.656855f, 4.0f, 22.0f, 5.343146f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.656855f, 20.656855f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.343146f, 20.0f, 2.0f, 18.656855f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 5.343146f, 3.343146f, 4.0f, 5.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.5f, 8.0f),
                    PathNode.CurveTo(7.119288f, 8.0f, 6.0f, 9.119288f, 6.0f, 10.5f),
                    PathNode.LineTo(6.0f, 13.5f),
                    PathNode.CurveTo(6.0f, 14.880712f, 7.119288f, 16.0f, 8.5f, 16.0f),
                    PathNode.CurveTo(9.880712f, 16.0f, 11.0f, 14.880712f, 11.0f, 13.5f),
                    PathNode.CurveTo(11.0f, 12.947715f, 10.552285f, 12.5f, 10.0f, 12.5f),
                    PathNode.CurveTo(9.447715f, 12.5f, 9.0f, 12.947715f, 9.0f, 13.5f),
                    PathNode.CurveTo(9.0f, 13.776142f, 8.776142f, 14.0f, 8.5f, 14.0f),
                    PathNode.CurveTo(8.223858f, 14.0f, 8.0f, 13.776142f, 8.0f, 13.5f),
                    PathNode.LineTo(8.0f, 10.5f),
                    PathNode.CurveTo(8.0f, 10.223858f, 8.223858f, 10.0f, 8.5f, 10.0f),
                    PathNode.CurveTo(8.776142f, 10.0f, 9.0f, 10.223858f, 9.0f, 10.5f),
                    PathNode.CurveTo(9.0f, 11.052285f, 9.447715f, 11.5f, 10.0f, 11.5f),
                    PathNode.CurveTo(10.552285f, 11.5f, 11.0f, 11.052285f, 11.0f, 10.5f),
                    PathNode.CurveTo(11.0f, 9.119288f, 9.880712f, 8.0f, 8.5f, 8.0f),
                    PathNode.MoveTo(15.5f, 8.0f),
                    PathNode.CurveTo(14.119288f, 8.0f, 13.0f, 9.119288f, 13.0f, 10.5f),
                    PathNode.LineTo(13.0f, 13.5f),
                    PathNode.CurveTo(13.0f, 14.880712f, 14.119288f, 16.0f, 15.5f, 16.0f),
                    PathNode.CurveTo(16.880713f, 16.0f, 18.0f, 14.880712f, 18.0f, 13.5f),
                    PathNode.CurveTo(18.0f, 12.947715f, 17.552284f, 12.5f, 17.0f, 12.5f),
                    PathNode.CurveTo(16.447716f, 12.5f, 16.0f, 12.947715f, 16.0f, 13.5f),
                    PathNode.CurveTo(16.0f, 13.776142f, 15.776142f, 14.0f, 15.5f, 14.0f),
                    PathNode.CurveTo(15.223858f, 14.0f, 15.0f, 13.776142f, 15.0f, 13.5f),
                    PathNode.LineTo(15.0f, 10.5f),
                    PathNode.CurveTo(15.0f, 10.223858f, 15.223858f, 10.0f, 15.5f, 10.0f),
                    PathNode.CurveTo(15.776142f, 10.0f, 16.0f, 10.223858f, 16.0f, 10.5f),
                    PathNode.CurveTo(16.0f, 11.052285f, 16.447716f, 11.5f, 17.0f, 11.5f),
                    PathNode.CurveTo(17.552284f, 11.5f, 18.0f, 11.052285f, 18.0f, 10.5f),
                    PathNode.CurveTo(18.0f, 9.119288f, 16.880713f, 8.0f, 15.5f, 8.0f)
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
        return _badgeCc!!
    }

private var _badgeCc: ImageVector? = null
