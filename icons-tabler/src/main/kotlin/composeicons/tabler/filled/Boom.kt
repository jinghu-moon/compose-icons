package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Boom: ImageVector
    get() {
        if (_boom != null) return _boom!!
        _boom = tablerFilledIcon(
            name = "Boom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.514 3.836C7.665 2.927 8.86 2.689 9.348 3.47c2.294 3.67 4.275 4.048 5.758 1.083C15.577 3.609 17 3.945 17 5c0 2.448 1.552 4 4 4 .89 0 1.337 1.077 .707 1.707-1.61 1.61-1.61 2.975 0 4.581 .63 .63 .185 1.707-.706 1.708C18.553 16.999 18 17.552 18 20c0 .961-1.223 1.369-1.8 .6C13.875 17.5 10.706 17.744 8.832 20.555c-.503 .754-1.67 .504-1.818-.39C6.649 17.977 5.974 17.509 2.836 16.986c-.369-.062-.673-.324-.788-.681-.114-.357-.02-.747 .245-1.012C3.911 13.675 3.911 12.266 2.24 10.312l-.009-.013-.013-.014-.044-.062-.01-.011-.006-.013-.038-.066-.017-.028-.001-.004-.027-.066L2.056 9.994C2.03 9.919 2.013 9.84 2.005 9.761L2.003 9.716 2 9.648c.002-.112 .022-.223 .06-.328l.009-.023 .023-.049 .011-.029 .009-.015 .007-.016 .019-.029 .02-.035 .012-.017 .013-.022 .027-.034 .011-.016 .018-.02 .02-.025 .021-.02 .015-.017 .035-.032 .02-.019 .009-.007 .018-.015 .055-.039 .018-.015 .008-.004 .01-.007 .061-.034 .028-.016 .004-.002 .063-.026 .044-.019c.038-.013 .076-.024 .115-.032l.004-.002 .267-.063C5.444 8.008 6.988 6.431 7.465 4.098Z"),
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
        return _boom!!
    }

private var _boom: ImageVector? = null
