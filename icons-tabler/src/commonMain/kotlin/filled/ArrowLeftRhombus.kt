package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowLeftRhombus: ImageVector
    get() {
        if (_arrowLeftRhombus != null) return _arrowLeftRhombus!!
        _arrowLeftRhombus = tablerFilledIcon(
            name = "ArrowLeftRhombus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.707f, 8.293f),
                    PathNode.CurveTo(7.097382f, 8.6835f, 7.097382f, 9.3165f, 6.707f, 9.707f),
                    PathNode.LineTo(5.415f, 11.0f),
                    PathNode.LineTo(15.584f, 11.0f),
                    PathNode.LineTo(17.793f, 8.793f),
                    PathNode.CurveTo(18.1835f, 8.402618f, 18.8165f, 8.402618f, 19.207f, 8.793f),
                    PathNode.LineTo(21.707f, 11.293f),
                    PathNode.CurveTo(22.097382f, 11.6835f, 22.097382f, 12.3165f, 21.707f, 12.707f),
                    PathNode.LineTo(19.207f, 15.207f),
                    PathNode.CurveTo(18.8165f, 15.597382f, 18.1835f, 15.597382f, 17.793f, 15.207f),
                    PathNode.LineTo(15.585f, 13.0f),
                    PathNode.LineTo(5.415f, 13.0f),
                    PathNode.LineTo(6.707f, 14.293f),
                    PathNode.CurveTo(7.063236f, 14.649268f, 7.098802f, 15.214914f, 6.79f, 15.613f),
                    PathNode.LineTo(6.707f, 15.707f),
                    PathNode.CurveTo(6.3165f, 16.097382f, 5.6835f, 16.097382f, 5.293f, 15.707f),
                    PathNode.LineTo(2.293f, 12.707f),
                    PathNode.CurveTo(2.257942f, 12.672116f, 2.225519f, 12.634681f, 2.196f, 12.595f),
                    PathNode.LineTo(2.125f, 12.485f),
                    PathNode.LineTo(2.071f, 12.371f),
                    PathNode.LineTo(2.036f, 12.266f),
                    PathNode.LineTo(2.011f, 12.148f),
                    PathNode.LineTo(2.004f, 12.09f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.LineTo(2.003f, 11.925f),
                    PathNode.LineTo(2.02f, 11.799f),
                    PathNode.LineTo(2.05f, 11.688f),
                    PathNode.LineTo(2.094f, 11.577f),
                    PathNode.LineTo(2.146f, 11.479f),
                    PathNode.LineTo(2.213f, 11.383f),
                    PathNode.LineTo(2.293f, 11.293f),
                    PathNode.LineTo(5.293f, 8.293f),
                    PathNode.CurveTo(5.6835f, 7.902618f, 6.3165f, 7.902618f, 6.707f, 8.293f)
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
        return _arrowLeftRhombus!!
    }

private var _arrowLeftRhombus: ImageVector? = null
