package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeWc: ImageVector
    get() {
        if (_badgeWc != null) return _badgeWc!!
        _badgeWc = tablerFilledIcon(
            name = "BadgeWc",
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
                    PathNode.MoveTo(11.466f, 8.0f),
                    PathNode.CurveTo(10.958828f, 8.017049f, 10.544832f, 8.411268f, 10.503f, 8.917f),
                    PathNode.LineTo(10.299f, 11.362f),
                    PathNode.LineTo(9.894f, 10.552f),
                    PathNode.LineTo(9.831f, 10.442f),
                    PathNode.CurveTo(9.632692f, 10.146345f, 9.292156f, 9.978411f, 8.936875f, 10.001067f),
                    PathNode.CurveTo(8.581594f, 10.023723f, 8.265147f, 10.233551f, 8.106f, 10.552f),
                    PathNode.LineTo(7.7f, 11.362f),
                    PathNode.LineTo(7.497f, 8.917f),
                    PathNode.CurveTo(7.455168f, 8.411268f, 7.041173f, 8.017049f, 6.534f, 8.0f),
                    PathNode.LineTo(6.417f, 8.003001f),
                    PathNode.CurveTo(6.152533f, 8.024898f, 5.907615f, 8.151017f, 5.736183f, 8.353585f),
                    PathNode.CurveTo(5.564751f, 8.556151f, 5.480866f, 8.818553f, 5.503f, 9.083f),
                    PathNode.LineTo(6.003f, 15.083f),
                    PathNode.LineTo(6.019f, 15.2f),
                    PathNode.CurveTo(6.194f, 16.11f, 7.46f, 16.315f, 7.894f, 15.447f),
                    PathNode.LineTo(9.0f, 13.236f),
                    PathNode.LineTo(10.106f, 15.447f),
                    PathNode.CurveTo(10.558f, 16.351f, 11.913f, 16.09f, 11.996f, 15.083f),
                    PathNode.LineTo(12.496f, 9.083f),
                    PathNode.CurveTo(12.542111f, 8.53265f, 12.133349f, 8.04912f, 11.583f, 8.003001f),
                    PathNode.Close,
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
        return _badgeWc!!
    }

private var _badgeWc: ImageVector? = null
