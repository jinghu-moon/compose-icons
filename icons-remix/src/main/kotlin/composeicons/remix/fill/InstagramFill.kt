package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InstagramFill: ImageVector
    get() {
        if (_instagramFill != null) return _instagramFill!!
        _instagramFill = remixIcon(
            name = "InstagramFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.028 2.001c1.125 .002 1.696 .008 2.189 .022l.194 .006c.224 .008 .445 .018 .712 .03 1.064 .049 1.79 .217 2.427 .465 .659 .254 1.216 .598 1.772 1.153 .555 .556 .898 1.114 1.153 1.772 .247 .637 .415 1.363 .465 2.428 .012 .267 .021 .488 .029 .712l.006 .194c.015 .493 .021 1.063 .023 2.189l.001 .746c0 .091 0 .185 0 .282l-0 .282-.001 .746c-.002 1.125-.008 1.696-.022 2.189l-.006 .194c-.008 .224-.018 .445-.03 .712-.049 1.064-.218 1.79-.465 2.427-.254 .659-.598 1.216-1.153 1.772-.556 .555-1.115 .898-1.772 1.153-.638 .247-1.363 .415-2.427 .465-.267 .012-.488 .022-.712 .029l-.194 .006c-.493 .015-1.063 .021-2.189 .024L12.282 22c-.091 0-.185 0-.282 0h-.282l-.746-.001C9.847 21.997 9.277 21.992 8.784 21.977l-.194-.006c-.224-.008-.445-.018-.712-.031C6.814 21.891 6.089 21.722 5.45 21.475 4.792 21.221 4.234 20.877 3.679 20.322 3.123 19.766 2.78 19.207 2.525 18.55c-.247-.637-.415-1.363-.465-2.427-.012-.267-.022-.488-.029-.712l-.006-.194c-.015-.493-.021-1.063-.023-2.189L2.001 10.972C2.003 9.847 2.009 9.276 2.023 8.784l.006-.194c.008-.224 .018-.445 .03-.712C2.109 6.813 2.278 6.088 2.525 5.45 2.779 4.792 3.123 4.234 3.679 3.678 4.234 3.123 4.793 2.78 5.45 2.525c.637-.247 1.362-.415 2.427-.465 .267-.012 .488-.022 .712-.029l.194-.006c.493-.015 1.063-.021 2.189-.023l2.056-0ZM12 7C9.237 7 7 9.24 7 12c0 2.763 2.24 5 5 5 2.763 0 5-2.24 5-5 0-2.763-2.24-5-5-5ZM12 9c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12c0-1.657 1.343-3 3-3ZM17.25 5.5c-.689 0-1.25 .56-1.25 1.249 0 .689 .56 1.25 1.25 1.25 .689 0 1.25-.56 1.25-1.25 0-.689-.562-1.25-1.25-1.249Z"),
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
        return _instagramFill!!
    }

private var _instagramFill: ImageVector? = null
