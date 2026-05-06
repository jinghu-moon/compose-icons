package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Settings3Line: ImageVector
    get() {
        if (_settings3Line != null) return _settings3Line!!
        _settings3Line = remixIcon(
            name = "Settings3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.339 17c-.432-.749-.757-1.53-.978-2.326 .972-.496 1.638-1.507 1.638-2.674C4 10.835 3.335 9.824 2.364 9.327 2.81 7.717 3.659 6.216 4.865 4.99c.916 .594 2.125 .665 3.135 .082C9.01 4.489 9.553 3.406 9.496 2.316c1.665-.431 3.389-.416 5.007 .003-.056 1.089 .487 2.171 1.497 2.753 1.01 .583 2.219 .512 3.135-.082 .579 .59 1.093 1.261 1.525 2.01 .432 .749 .757 1.53 .978 2.326-.972 .496-1.638 1.507-1.638 2.674 0 1.166 .665 2.176 1.636 2.673-.447 1.611-1.295 3.111-2.501 4.337-.916-.594-2.125-.665-3.135-.082-1.01 .583-1.553 1.666-1.497 2.756-1.665 .431-3.388 .416-5.007-.003C9.552 20.592 9.009 19.511 8 18.928c-1.01-.583-2.219-.512-3.135 .082C4.286 18.42 3.772 17.749 3.339 17ZM9 17.196c1.091 .63 1.875 1.626 2.251 2.77 .498 .047 1 .048 1.498 .002 .375-1.144 1.159-2.141 2.251-2.771 1.092-.63 2.347-.811 3.526-.564 .289-.408 .54-.843 .748-1.298-.802-.897-1.273-2.074-1.273-3.334 0-1.26 .471-2.437 1.273-3.334-.104-.226-.219-.448-.345-.666-.126-.218-.261-.429-.405-.632-1.178 .246-2.432 .066-3.524-.564C13.908 6.174 13.125 5.178 12.749 4.035c-.498-.047-1-.048-1.498-.002C10.876 5.177 10.092 6.174 9 6.804 7.908 7.434 6.652 7.615 5.474 7.368c-.289 .408-.54 .843-.748 1.298 .802 .897 1.273 2.074 1.273 3.334 0 1.26-.471 2.437-1.273 3.334 .104 .226 .219 .448 .345 .666 .126 .218 .261 .429 .405 .632 1.178-.246 2.432-.066 3.524 .564ZM12 15c-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3ZM12 13c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _settings3Line!!
    }

private var _settings3Line: ImageVector? = null
