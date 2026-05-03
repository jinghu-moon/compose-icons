package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SortAscendingShapes: ImageVector
    get() {
        if (_sortAscendingShapes != null) return _sortAscendingShapes!!
        _sortAscendingShapes = tablerFilledIcon(
            name = "SortAscendingShapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 5.0f),
                    PathNode.CurveTo(7.552285f, 5.0f, 8.0f, 5.447716f, 8.0f, 6.0f),
                    PathNode.LineTo(8.0f, 15.584f),
                    PathNode.LineTo(9.293f, 14.293f),
                    PathNode.CurveTo(9.649268f, 13.936765f, 10.214914f, 13.901197f, 10.613f, 14.21f),
                    PathNode.LineTo(10.707f, 14.293f),
                    PathNode.CurveTo(11.097382f, 14.6835f, 11.097382f, 15.3165f, 10.707f, 15.707f),
                    PathNode.LineTo(7.707f, 18.707f),
                    PathNode.CurveTo(7.672117f, 18.742058f, 7.634681f, 18.77448f, 7.595f, 18.804f),
                    PathNode.LineTo(7.485f, 18.875f),
                    PathNode.LineTo(7.371f, 18.929f),
                    PathNode.LineTo(7.266f, 18.964f),
                    PathNode.LineTo(7.117f, 18.994f),
                    PathNode.LineTo(7.0f, 19.0f),
                    PathNode.LineTo(6.925f, 18.997f),
                    PathNode.LineTo(6.799f, 18.98f),
                    PathNode.LineTo(6.688f, 18.95f),
                    PathNode.LineTo(6.577f, 18.906f),
                    PathNode.LineTo(6.479f, 18.854f),
                    PathNode.LineTo(6.383f, 18.787f),
                    PathNode.LineTo(6.293f, 18.707f),
                    PathNode.LineTo(3.293f, 15.707f),
                    PathNode.CurveTo(2.914028f, 15.314621f, 2.919448f, 14.690915f, 3.305182f, 14.305182f),
                    PathNode.CurveTo(3.690915f, 13.919448f, 4.314621f, 13.914028f, 4.707f, 14.293f),
                    PathNode.LineTo(6.0f, 15.586f),
                    PathNode.LineTo(6.0f, 6.0f),
                    PathNode.CurveTo(6.0f, 5.447716f, 6.447716f, 5.0f, 7.0f, 5.0f),
                    PathNode.MoveTo(19.0f, 3.0f),
                    PathNode.CurveTo(20.10457f, 3.0f, 21.0f, 3.895431f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 9.0f),
                    PathNode.CurveTo(21.0f, 10.104569f, 20.10457f, 11.0f, 19.0f, 11.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(13.895431f, 11.0f, 13.0f, 10.104569f, 13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 5.0f),
                    PathNode.CurveTo(13.0f, 3.895431f, 13.895431f, 3.0f, 15.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(17.864f, 13.496f),
                    PathNode.LineTo(21.364f, 19.496f),
                    PathNode.CurveTo(21.544504f, 19.80533f, 21.545803f, 20.187574f, 21.367401f, 20.498125f),
                    PathNode.CurveTo(21.189001f, 20.808674f, 20.858145f, 21.000107f, 20.5f, 21.0f),
                    PathNode.LineTo(13.5f, 21.0f),
                    PathNode.CurveTo(13.141855f, 21.000107f, 12.810999f, 20.808674f, 12.632598f, 20.498125f),
                    PathNode.CurveTo(12.454197f, 20.187574f, 12.455495f, 19.80533f, 12.636f, 19.496f),
                    PathNode.LineTo(16.136f, 13.496f),
                    PathNode.CurveTo(16.315155f, 13.188568f, 16.644176f, 12.999492f, 17.0f, 12.999492f),
                    PathNode.CurveTo(17.355824f, 12.999492f, 17.684843f, 13.188568f, 17.864f, 13.496f)
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
        return _sortAscendingShapes!!
    }

private var _sortAscendingShapes: ImageVector? = null
