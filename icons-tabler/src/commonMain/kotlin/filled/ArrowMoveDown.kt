package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowMoveDown: ImageVector
    get() {
        if (_arrowMoveDown != null) return _arrowMoveDown!!
        _arrowMoveDown = tablerFilledIcon(
            name = "ArrowMoveDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(12.552285f, 10.0f, 13.0f, 10.447715f, 13.0f, 11.0f),
                    PathNode.LineTo(13.0f, 18.584f),
                    PathNode.LineTo(14.293f, 17.293f),
                    PathNode.CurveTo(14.649268f, 16.936766f, 15.214914f, 16.901197f, 15.613f, 17.21f),
                    PathNode.LineTo(15.707f, 17.293f),
                    PathNode.CurveTo(16.097382f, 17.6835f, 16.097382f, 18.3165f, 15.707f, 18.707f),
                    PathNode.LineTo(12.707f, 21.707f),
                    PathNode.CurveTo(12.672116f, 21.742058f, 12.634681f, 21.77448f, 12.595f, 21.804f),
                    PathNode.LineTo(12.485f, 21.875f),
                    PathNode.LineTo(12.371f, 21.929f),
                    PathNode.LineTo(12.266f, 21.964f),
                    PathNode.LineTo(12.117f, 21.994f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(11.925f, 21.997f),
                    PathNode.LineTo(11.799f, 21.98f),
                    PathNode.LineTo(11.688f, 21.95f),
                    PathNode.LineTo(11.577f, 21.906f),
                    PathNode.LineTo(11.479f, 21.854f),
                    PathNode.LineTo(11.383f, 21.787f),
                    PathNode.LineTo(11.293f, 21.707f),
                    PathNode.LineTo(8.293f, 18.707f),
                    PathNode.CurveTo(7.914028f, 18.31462f, 7.919448f, 17.690916f, 8.305182f, 17.305182f),
                    PathNode.CurveTo(8.690915f, 16.919447f, 9.314621f, 16.914028f, 9.707f, 17.293f),
                    PathNode.LineTo(11.0f, 18.586f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.CurveTo(11.0f, 10.447715f, 11.447715f, 10.0f, 12.0f, 10.0f),
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(13.656855f, 2.0f, 15.0f, 3.343146f, 15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 6.656854f, 13.656855f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(10.343145f, 8.0f, 9.0f, 6.656854f, 9.0f, 5.0f),
                    PathNode.LineTo(9.005f, 4.824f),
                    PathNode.CurveTo(9.098195f, 3.238179f, 10.411443f, 1.999912f, 12.0f, 2.0f)
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
        return _arrowMoveDown!!
    }

private var _arrowMoveDown: ImageVector? = null
