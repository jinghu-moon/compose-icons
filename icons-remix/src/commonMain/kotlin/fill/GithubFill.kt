package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GithubFill: ImageVector
    get() {
        if (_githubFill != null) return _githubFill!!
        _githubFill = remixIcon(
            name = "GithubFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.001 2.000 C 6.476 2.000 2.001 6.475 2.001 12.000 C 2.001 16.425 4.863 20.163 8.838 21.487 C 9.338 21.575 9.526 21.275 9.526 21.013 C 9.526 20.775 9.513 19.987 9.513 19.150 C 7.001 19.612 6.351 18.538 6.151 17.975 C 6.038 17.688 5.551 16.800 5.126 16.562 C 4.776 16.375 4.276 15.913 5.113 15.900 C 5.901 15.887 6.463 16.625 6.651 16.925 C 7.551 18.438 8.988 18.013 9.563 17.750 C 9.651 17.100 9.913 16.663 10.201 16.413 C 7.976 16.163 5.651 15.300 5.651 11.475 C 5.651 10.387 6.038 9.488 6.676 8.788 C 6.576 8.538 6.226 7.512 6.776 6.137 C 6.776 6.137 7.613 5.875 9.526 7.162 C 10.326 6.938 11.176 6.825 12.026 6.825 C 12.876 6.825 13.726 6.938 14.526 7.162 C 16.438 5.863 17.276 6.137 17.276 6.137 C 17.826 7.512 17.476 8.538 17.376 8.788 C 18.014 9.488 18.401 10.375 18.401 11.475 C 18.401 15.312 16.063 16.163 13.839 16.413 C 14.201 16.725 14.514 17.325 14.514 18.263 C 14.514 19.600 14.501 20.675 14.501 21.013 C 14.501 21.275 14.689 21.587 15.189 21.487 C 19.259 20.113 22.000 16.296 22.001 12.000 C 22.001 6.475 17.526 2.000 12.001 2.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _githubFill!!
    }

private var _githubFill: ImageVector? = null
