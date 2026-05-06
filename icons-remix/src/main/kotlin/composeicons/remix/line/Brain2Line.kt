package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Brain2Line: ImageVector
    get() {
        if (_brain2Line != null) return _brain2Line!!
        _brain2Line = remixIcon(
            name = "Brain2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 6c0 .237 .041 .462 .115 .67 .112 .316 .059 .666-.142 .934-.201 .268-.523 .418-.857 .399C6.078 8.001 6.039 8 6 8 4.895 8 4 8.895 4 10c0 .513 .192 .979 .509 1.333 .34 .38 .34 .954 0 1.334C4.192 13.021 4 13.487 4 14c0 .884 .574 1.637 1.373 1.9 .476 .157 .762 .642 .67 1.134C6.015 17.185 6 17.34 6 17.5 6 18.881 7.119 20 8.5 20c1.259 0 2.302-.931 2.475-2.142 .006-.042 .015-.083 .025-.122v-11.736C11 4.895 10.105 4 9 4 7.895 4 7 4.895 7 6ZM13 17.736c.011 .04 .019 .081 .025 .122 .173 1.211 1.216 2.142 2.475 2.142C16.881 20 18 18.881 18 17.5c0-.16-.015-.315-.043-.465-.092-.493 .194-.978 .67-1.134C19.426 15.637 20 14.884 20 14c0-.513-.192-.979-.509-1.333-.34-.38-.34-.954 0-1.334C19.808 10.979 20 10.513 20 10 20 8.895 19.105 8 18 8c-.039 0-.078 .001-.116 .003-.334 .019-.656-.131-.857-.399-.201-.268-.254-.619-.142-.934C16.959 6.462 17 6.237 17 6 17 4.895 16.105 4 15 4c-1.105 0-2 .895-2 2v11.736ZM9 2c1.195 0 2.267 .524 3 1.354C12.733 2.524 13.805 2 15 2c2.209 0 4 1.791 4 4 0 .042-.001 .084-.002 .126C20.724 6.569 22 8.135 22 10c0 .728-.195 1.412-.535 2 .34 .588 .535 1.272 .535 2 0 1.482-.805 2.773-2 3.465l0 .035C20 19.985 17.985 22 15.5 22 14.086 22 12.825 21.348 12 20.329 11.175 21.348 9.914 22 8.5 22 6.015 22 4 19.985 4 17.5l0-.035C2.805 16.773 2 15.482 2 14c0-.728 .195-1.412 .535-2C2.195 11.412 2 10.728 2 10 2 8.135 3.276 6.569 5.002 6.126 5.001 6.084 5 6.042 5 6 5 3.791 6.791 2 9 2Z"),
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
        return _brain2Line!!
    }

private var _brain2Line: ImageVector? = null
