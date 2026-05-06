package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TailwindCssLine: ImageVector
    get() {
        if (_tailwindCssLine != null) return _tailwindCssLine!!
        _tailwindCssLine = remixIcon(
            name = "TailwindCssLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.127 6.219C9.178 5.378 10.499 5 12.001 5c1.409 0 2.485 .331 3.358 .834 .739 .426 1.353 1.008 1.948 1.611 .646 .656 .996 .975 1.437 1.085 .473 .118 .873 .083 1.239-.074 .38-.163 .792-.487 1.219-1.056l1.77 .843c-.371 1.484-1.047 2.7-2.095 3.538C19.825 12.622 18.504 13 17.001 13c-1.408 0-2.484-.331-3.357-.834-.834-.48-1.443-1.098-1.921-1.583C11.061 9.911 10.706 9.582 10.259 9.47 9.786 9.352 9.386 9.388 9.02 9.544c-.38 .163-.792 .487-1.219 1.056L6.031 9.757C6.402 8.273 7.079 7.058 8.127 6.219ZM12.001 7c-.829 0-1.496 .146-2.033 .408 1.32 .083 2.181 .895 3.057 1.721 .504 .476 1.013 .956 1.618 1.304 .559 .322 1.289 .567 2.359 .567 .829 0 1.496-.146 2.033-.408C17.715 10.509 16.854 9.697 15.979 8.871 15.474 8.395 14.965 7.915 14.361 7.567 13.802 7.245 13.072 7 12.001 7ZM3.127 12.219C4.178 11.378 5.499 11 7.001 11c1.409 0 2.485 .331 3.358 .834 .739 .426 1.353 1.008 1.948 1.611 .646 .656 .996 .975 1.436 1.085 .473 .118 .873 .083 1.239-.074 .38-.163 .792-.487 1.219-1.056l1.77 .843c-.371 1.484-1.047 2.7-2.095 3.538C14.825 18.622 13.504 19 12.001 19c-1.408 0-2.484-.331-3.357-.834C7.81 17.686 7.201 17.068 6.723 16.583 6.061 15.911 5.706 15.582 5.259 15.47c-.473-.118-.873-.083-1.239 .074-.38 .163-.792 .487-1.219 1.056L1.031 15.757c.371-1.484 1.047-2.7 2.095-3.538ZM7.001 13c-.829 0-1.496 .146-2.033 .408 1.32 .083 2.181 .895 3.057 1.721h0c.504 .476 1.013 .956 1.618 1.304 .559 .322 1.289 .567 2.359 .567 .828 0 1.496-.146 2.033-.408-1.32-.083-2.181-.895-3.056-1.721-.504-.476-1.013-.956-1.617-1.304C8.802 13.245 8.072 13 7.001 13Z"),
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
        return _tailwindCssLine!!
    }

private var _tailwindCssLine: ImageVector? = null
