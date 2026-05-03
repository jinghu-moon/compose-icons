package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MetaLine: ImageVector
    get() {
        if (_metaLine != null) return _metaLine!!
        _metaLine = remixIcon(
            name = "MetaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.974 16.163 C 20.689 17.055 20.199 17.500 19.505 17.500 C 18.627 17.500 17.765 16.973 16.917 15.921 C 16.328 15.189 15.503 13.800 14.440 11.752 C 13.984 10.872 13.561 10.096 13.171 9.422 C 13.481 8.934 13.757 8.542 14.000 8.246 C 14.957 7.082 15.959 6.500 17.005 6.500 C 17.840 6.500 18.635 7.036 19.391 8.108 C 20.167 9.209 20.711 10.569 21.023 12.189 C 21.329 13.782 21.313 15.107 20.974 16.163 ZM 12.005 11.430 C 12.215 11.815 12.435 12.229 12.665 12.672 C 13.789 14.839 14.687 16.340 15.359 17.175 C 16.607 18.725 17.989 19.500 19.505 19.500 C 20.361 19.500 21.093 19.230 21.702 18.689 C 22.227 18.223 22.619 17.585 22.879 16.774 C 23.322 15.393 23.358 13.739 22.987 11.811 C 22.621 9.910 21.967 8.291 21.025 6.955 C 19.871 5.318 18.531 4.500 17.005 4.500 C 15.329 4.500 13.812 5.325 12.455 6.976 C 12.313 7.149 12.163 7.347 12.005 7.570 C 11.847 7.347 11.697 7.149 11.555 6.976 C 10.198 5.325 8.681 4.500 7.005 4.500 C 5.479 4.500 4.139 5.318 2.985 6.955 C 2.043 8.291 1.389 9.910 1.023 11.811 C 0.652 13.739 0.688 15.393 1.131 16.774 C 1.391 17.585 1.783 18.223 2.308 18.689 C 2.917 19.230 3.649 19.500 4.505 19.500 C 6.021 19.500 7.403 18.725 8.651 17.175 C 9.323 16.340 10.221 14.839 11.345 12.673 C 11.575 12.229 11.795 11.815 12.005 11.430 ZM 10.838 9.422 C 10.449 10.096 10.026 10.872 9.570 11.752 C 8.507 13.800 7.681 15.189 7.093 15.921 C 6.245 16.973 5.383 17.500 4.505 17.500 C 3.811 17.500 3.321 17.055 3.035 16.163 C 2.697 15.107 2.681 13.782 2.987 12.189 C 3.298 10.569 3.842 9.209 4.619 8.108 C 5.375 7.036 6.170 6.500 7.005 6.500 C 8.051 6.500 9.053 7.082 10.010 8.246 C 10.253 8.542 10.529 8.934 10.838 9.422 Z"),
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
        return _metaLine!!
    }

private var _metaLine: ImageVector? = null
