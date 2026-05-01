package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitUp: ImageVector
    get() {
        if (_arrowAutofitUp != null) return _arrowAutofitUp!!
        _arrowAutofitUp = tablerFilledIcon(
            name = "ArrowAutofitUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 21.0f),
                    PathNode.CurveTo(14.552285f, 21.0f, 15.0f, 20.552284f, 15.0f, 20.0f),
                    PathNode.LineTo(15.0f, 8.999f),
                    PathNode.LineTo(14.908f, 8.999f),
                    PathNode.CurveTo(13.711741f, 8.962596f, 12.651566f, 8.21866f, 12.210454f, 7.106103f),
                    PathNode.CurveTo(11.769343f, 5.993547f, 12.031699f, 4.725247f, 12.878f, 3.879f),
                    PathNode.CurveTo(13.025026f, 3.731846f, 13.06909f, 3.51069f, 12.989689f, 3.318422f),
                    PathNode.CurveTo(12.910288f, 3.126155f, 12.723017f, 3.000533f, 12.515f, 3.0f),
                    PathNode.LineTo(6.0f, 3.0f),
                    PathNode.CurveTo(4.343146f, 3.0f, 3.0f, 4.343146f, 3.0f, 6.0f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.CurveTo(3.0f, 19.656855f, 4.343146f, 21.0f, 6.0f, 21.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 21.0f),
                    PathNode.CurveTo(18.552284f, 21.0f, 19.0f, 20.552284f, 19.0f, 20.0f),
                    PathNode.LineTo(19.0f, 5.416f),
                    PathNode.LineTo(20.293f, 6.707f),
                    PathNode.CurveTo(20.64927f, 7.063236f, 21.214914f, 7.098802f, 21.613f, 6.79f),
                    PathNode.LineTo(21.707f, 6.707f),
                    PathNode.CurveTo(22.097382f, 6.3165f, 22.097382f, 5.6835f, 21.707f, 5.293f),
                    PathNode.LineTo(18.707f, 2.293f),
                    PathNode.CurveTo(18.672117f, 2.257942f, 18.63468f, 2.225519f, 18.595f, 2.196f),
                    PathNode.LineTo(18.485f, 2.125f),
                    PathNode.LineTo(18.371f, 2.071f),
                    PathNode.LineTo(18.266f, 2.036f),
                    PathNode.LineTo(18.117f, 2.006f),
                    PathNode.LineTo(18.0f, 2.0f),
                    PathNode.LineTo(17.925f, 2.003f),
                    PathNode.LineTo(17.799f, 2.02f),
                    PathNode.LineTo(17.688f, 2.05f),
                    PathNode.LineTo(17.577f, 2.094f),
                    PathNode.LineTo(17.479f, 2.146f),
                    PathNode.LineTo(17.383f, 2.213f),
                    PathNode.LineTo(17.293f, 2.293f),
                    PathNode.LineTo(14.293f, 5.293f),
                    PathNode.CurveTo(14.033044f, 5.544075f, 13.928787f, 5.915878f, 14.020303f, 6.265507f),
                    PathNode.CurveTo(14.111818f, 6.615137f, 14.384863f, 6.888182f, 14.734492f, 6.979697f),
                    PathNode.CurveTo(15.084122f, 7.071213f, 15.455926f, 6.966957f, 15.707f, 6.707f),
                    PathNode.LineTo(17.0f, 5.414f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(17.0f, 20.552284f, 17.447716f, 21.0f, 18.0f, 21.0f)
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
        return _arrowAutofitUp!!
    }

private var _arrowAutofitUp: ImageVector? = null
