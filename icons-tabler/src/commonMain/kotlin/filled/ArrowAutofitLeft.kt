package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitLeft: ImageVector
    get() {
        if (_arrowAutofitLeft != null) return _arrowAutofitLeft!!
        _arrowAutofitLeft = tablerFilledIcon(
            name = "ArrowAutofitLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 14.0f),
                    PathNode.CurveTo(21.0f, 14.552285f, 20.552284f, 15.0f, 20.0f, 15.0f),
                    PathNode.LineTo(8.999f, 15.0f),
                    PathNode.LineTo(8.999f, 14.908f),
                    PathNode.CurveTo(8.962596f, 13.711741f, 8.21866f, 12.651566f, 7.106103f, 12.210454f),
                    PathNode.CurveTo(5.993547f, 11.769343f, 4.725247f, 12.031699f, 3.879f, 12.878f),
                    PathNode.CurveTo(3.731846f, 13.025026f, 3.51069f, 13.06909f, 3.318422f, 12.989689f),
                    PathNode.CurveTo(3.126155f, 12.910288f, 3.000533f, 12.723017f, 3.0f, 12.515f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 4.343146f, 4.343146f, 3.0f, 6.0f, 3.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.CurveTo(19.656855f, 3.0f, 21.0f, 4.343146f, 21.0f, 6.0f),
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
                    PathNode.MoveTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 18.552284f, 20.552284f, 19.0f, 20.0f, 19.0f),
                    PathNode.LineTo(5.416f, 19.0f),
                    PathNode.LineTo(6.707f, 20.293f),
                    PathNode.CurveTo(7.063236f, 20.64927f, 7.098802f, 21.214914f, 6.79f, 21.613f),
                    PathNode.LineTo(6.707f, 21.707f),
                    PathNode.CurveTo(6.3165f, 22.097382f, 5.6835f, 22.097382f, 5.293f, 21.707f),
                    PathNode.LineTo(2.293f, 18.707f),
                    PathNode.CurveTo(2.257942f, 18.672117f, 2.225519f, 18.63468f, 2.196f, 18.595f),
                    PathNode.LineTo(2.125f, 18.485f),
                    PathNode.LineTo(2.071f, 18.371f),
                    PathNode.LineTo(2.036f, 18.266f),
                    PathNode.LineTo(2.006f, 18.117f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.LineTo(2.003f, 17.925f),
                    PathNode.LineTo(2.02f, 17.799f),
                    PathNode.LineTo(2.05f, 17.688f),
                    PathNode.LineTo(2.094f, 17.577f),
                    PathNode.LineTo(2.146f, 17.479f),
                    PathNode.LineTo(2.213f, 17.383f),
                    PathNode.LineTo(2.293f, 17.293f),
                    PathNode.LineTo(5.293f, 14.293f),
                    PathNode.CurveTo(5.544075f, 14.033044f, 5.915878f, 13.928787f, 6.265507f, 14.020303f),
                    PathNode.CurveTo(6.615137f, 14.111818f, 6.888182f, 14.384863f, 6.979697f, 14.734492f),
                    PathNode.CurveTo(7.071213f, 15.084122f, 6.966957f, 15.455926f, 6.707f, 15.707f),
                    PathNode.LineTo(5.414f, 17.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.CurveTo(20.552284f, 17.0f, 21.0f, 17.447716f, 21.0f, 18.0f)
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
        return _arrowAutofitLeft!!
    }

private var _arrowAutofitLeft: ImageVector? = null
