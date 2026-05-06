package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EvernoteLine: ImageVector
    get() {
        if (_evernoteLine != null) return _evernoteLine!!
        _evernoteLine = remixIcon(
            name = "EvernoteLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.501 8.5c0 .552-.448 1-1 1h-3.499c-.336 0-.501 .261-.501 .532 0 1.319 .254 2.371 .664 3.193 .216 .433 .399 .67 .523 .789 .735 .761 1.886 1.161 3.092 1.089 .095-.006 .198-.064 .331-.207 .122-.132 .204-.269 .215-.293 .425-.973 1.536-1.444 2.531-1.073 .693 .258 1.276 .434 1.813 .56 .196 .046 .375 .083 .586 .123-.077-.015 .402 .074 .518 .098 .34 .07 .598 .146 .883 .29 .707 .358 1.317 .865 1.774 1.475 .045-.592 .077-1.268 .087-2.026 .029-2.157-.138-4.411-.558-6.673-.075-.398-.237-.562-.664-.718-.164-.06-.354-.109-.586-.154-.147-.028-.651-.11-.694-.118-.015-.003-.015-.003-.011-.002-.292-.051-.687-.12-1.16-.202-.378-.066-.642-.112-1.169-.205-.422-.074-.422-.074-.528-.092C12.454 5.762 11.875 5.283 11.625 4.624c-.013-.034-.024-.063-.034-.088-.113-.014-.337-.036-.702-.036-.271 0-.388 .124-.388 .463v3.537ZM16.73 20.139c.353-.356 .561-.829 .587-1.327 .054-1.036-.824-2.479-2.317-2.634-.617-.064-1.586-.306-2.842-.775 0 0-.701 1.603-2.26 1.696C8.234 17.199 6.469 16.667 5.249 15.404c0 0-1.748-1.639-1.748-5.371 0-.815 .29-1.423 .648-1.905C5.109 6.836 6.654 5.348 8.282 3.824 9.001 3.151 9.702 2.5 10.889 2.5c2.041 0 2.321 .664 2.606 1.414 0 0 1.897 .333 2.854 .499 .907 .166 3.15 .316 3.578 2.594 1.006 5.421 .458 9.871 .347 10.675-.709 5.122-4.772 4.872-4.931 4.872-2.059 0-3.178-1.374-3.183-2.677-.003-.837 .407-1.578 1.038-2.034 .609-.44 1.239-.478 1.526-.478 .305 0 .688 .317 .688 .753 0 .37-.255 .575-.383 .645-.223 .123-1.121 .173-1.121 .865 0 .317 .349 1.114 1.385 1.114 .589 0 1.094-.255 1.438-.602ZM14.935 10.629c.166-.415 .627-.633 1.172-.582 .544 .067 .956 .399 1.006 .848 0 .083 .017 .183-.017 .233-.033 .05-.066 .067-.1 .067-.214 .033-.544 0-1.022-.05-.479-.05-.808-.099-1.006-.2-.033-.017-.066-.033-.083-.083-.017-.049 .016-.149 .049-.232Z"),
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
        return _evernoteLine!!
    }

private var _evernoteLine: ImageVector? = null
