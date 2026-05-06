package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) return _lineSegments!!
        _lineSegments = phosphorFillIcon(
            name = "LineSegments",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.81 75.79C230.563 81.055 223.433 84.01 216 84c-1.905-.003-3.804-.198-5.67-.58l-30.57 56.77h0c10.196 10.194 10.985 26.464 1.822 37.595-9.163 11.132-25.28 13.486-37.244 5.44-11.964-8.046-15.862-23.862-9.008-36.546L109.27 120.62c-4.076 2.205-8.635 3.366-13.27 3.38-1.905-.003-3.804-.197-5.67-.58L59.76 180.18h0c10.934 10.935 10.933 28.663-.001 39.597-10.935 10.934-28.663 10.934-39.597 0C9.227 208.843 9.226 191.115 20.16 180.18h0c6.668-6.662 16.24-9.522 25.47-7.61L76.2 115.8h0C65.285 104.853 65.285 87.137 76.2 76.19h0c9.83-9.836 25.39-10.967 36.539-2.656 11.149 8.311 14.509 23.546 7.891 35.776l26.06 26.06c5.812-3.126 12.538-4.106 19-2.77L196.26 75.83h0c-5.252-5.251-8.202-12.373-8.202-19.8 0-7.427 2.95-14.549 8.202-19.8h0c10.935-10.935 28.665-10.935 39.6 0 10.935 10.935 10.935 28.665 0 39.6Z"),
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
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
