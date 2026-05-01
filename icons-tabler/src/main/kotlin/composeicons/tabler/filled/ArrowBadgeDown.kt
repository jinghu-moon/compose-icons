package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBadgeDown: ImageVector
    get() {
        if (_arrowBadgeDown != null) return _arrowBadgeDown!!
        _arrowBadgeDown = tablerFilledIcon(
            name = "ArrowBadgeDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.375f, 6.22f),
                    PathNode.LineTo(12.0f, 9.718f),
                    PathNode.LineTo(7.625f, 6.218f),
                    PathNode.CurveTo(7.324675f, 5.977547f, 6.913039f, 5.930705f, 6.566367f, 6.097534f),
                    PathNode.CurveTo(6.219696f, 6.264363f, 5.999471f, 6.615276f, 6.0f, 7.0f),
                    PathNode.LineTo(6.0f, 13.0f),
                    PathNode.CurveTo(6.00019f, 13.303428f, 6.138137f, 13.590358f, 6.375f, 13.78f),
                    PathNode.LineTo(11.375f, 17.78f),
                    PathNode.CurveTo(11.740333f, 18.0725f, 12.259667f, 18.0725f, 12.625f, 17.78f),
                    PathNode.LineTo(17.625f, 13.78f),
                    PathNode.CurveTo(17.861864f, 13.590358f, 17.999811f, 13.303428f, 18.0f, 13.0f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.CurveTo(17.99976f, 6.615638f, 17.779243f, 6.265427f, 17.432732f, 6.099102f),
                    PathNode.CurveTo(17.08622f, 5.932776f, 16.675043f, 5.979773f, 16.375f, 6.22f),
                    PathNode.Close
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
        return _arrowBadgeDown!!
    }

private var _arrowBadgeDown: ImageVector? = null
