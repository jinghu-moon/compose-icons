package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceTvOld: ImageVector
    get() {
        if (_deviceTvOld != null) return _deviceTvOld!!
        _deviceTvOld = tablerFilledIcon(
            name = "DeviceTvOld",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.707 2.293 L 12.000 5.585 L 15.293 2.293 C 15.649 1.937 16.215 1.901 16.613 2.210 L 16.707 2.293 C 17.097 2.683 17.097 3.317 16.707 3.707 L 14.414 6.000 L 19.000 6.000 C 20.657 6.000 22.000 7.343 22.000 9.000 L 22.000 18.000 C 22.000 19.657 20.657 21.000 19.000 21.000 L 5.000 21.000 C 3.343 21.000 2.000 19.657 2.000 18.000 L 2.000 9.000 C 2.000 7.343 3.343 6.000 5.000 6.000 L 9.585 6.000 L 7.293 3.707 C 6.914 3.315 6.919 2.691 7.305 2.305 C 7.691 1.919 8.315 1.914 8.707 2.293M 19.000 8.000 L 17.000 8.000 C 16.448 8.000 16.000 8.448 16.000 9.000 L 16.000 18.000 C 16.000 18.552 16.448 19.000 17.000 19.000 L 19.000 19.000 C 19.552 19.000 20.000 18.552 20.000 18.000 L 20.000 9.000 C 20.000 8.448 19.552 8.000 19.000 8.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 18.000 14.000 C 18.507 14.000 18.934 14.380 18.993 14.883 L 19.000 15.010 C 18.999 15.539 18.587 15.976 18.059 16.007 C 17.530 16.038 17.069 15.652 17.007 15.127 L 17.000 15.000 C 17.000 14.448 17.448 14.000 18.000 14.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 18.000 11.000 C 18.507 11.000 18.934 11.380 18.993 11.883 L 19.000 12.010 C 18.999 12.539 18.587 12.976 18.059 13.007 C 17.530 13.038 17.069 12.652 17.007 12.127 L 17.000 12.000 C 17.000 11.448 17.448 11.000 18.000 11.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _deviceTvOld!!
    }

private var _deviceTvOld: ImageVector? = null
