package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Glasses2Line: ImageVector
    get() {
        if (_glasses2Line != null) return _glasses2Line!!
        _glasses2Line = remixIcon(
            name = "Glasses2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.015 10.988C3.044 9.453 3.126 8.467 3.355 7.321 3.686 5.663 4.309 4.662 5.554 3.832L4.445 2.168C2.69 3.338 1.812 4.837 1.394 6.929 .874 9.528 .996 14.864 .999 14.998c0 .001-0 .002-0 .002 0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5 0-.274-.022-.543-.065-.806 .33-.125 .689-.194 1.065-.194 .376 0 .734 .069 1.065 .194-.043 .263-.065 .532-.065 .806 0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5 0 0 0 0 0 0h0c0 0 .132-5.439-.394-8.071C22.187 4.837 21.309 3.338 19.554 2.168L18.445 3.832c1.245 .83 1.867 1.831 2.199 3.489 .229 1.146 .311 2.132 .34 3.667C20.15 10.367 19.118 10 17.999 10c-1.778 0-3.338 .928-4.225 2.325C13.222 12.115 12.623 12 11.999 12c-.624 0-1.223 .115-1.775 .325C9.337 10.928 7.777 10 5.999 10c-1.118 0-2.151 .367-2.984 .988ZM2.999 15c0-1.657 1.343-3 3-3 1.307 0 2.421 .836 2.832 2.006 .109 .31 .168 .644 .168 .994 0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3ZM15.167 14.006C15.578 12.836 16.692 12 17.999 12c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-.35 .06-.684 .168-.994Z"),
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
        return _glasses2Line!!
    }

private var _glasses2Line: ImageVector? = null
