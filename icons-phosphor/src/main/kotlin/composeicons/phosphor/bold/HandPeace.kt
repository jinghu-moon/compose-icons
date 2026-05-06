package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandPeace: ImageVector
    get() {
        if (_handPeace != null) return _handPeace!!
        _handPeace = phosphorBoldIcon(
            name = "HandPeace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.7 28C209.228 16.793 196.642 10.588 183.811 12.278c-12.831 1.69-23.381 10.942-26.731 23.442L148 69.64 138.91 35.73C134.125 18.915 116.732 9.053 99.846 13.579 82.96 18.106 72.832 35.347 77.1 52.3l7.72 28.82-2.49-.48C69.664 78.1 56.713 83.426 49.497 94.14c-7.216 10.715-7.282 24.717-.167 35.5 .63 .95 1.31 1.86 2 2.73-3.348 4.042-5.64 8.853-6.67 14-.443 2.168-.661 4.377-.65 6.59v7.04c0 46.392 37.608 84 84 84h.64c46-.34 83.36-38.43 83.36-84.9v-3.34c-.009-12.61-4.003-24.895-11.41-35.1L218.9 52.3C221.119 44.098 219.966 35.349 215.7 28ZM180.26 41.94c1.143-4.269 5.531-6.803 9.8-5.66 4.269 1.143 6.803 5.531 5.66 9.8L180.47 103c-4.722-2.557-9.768-4.464-15-5.67ZM101.08 40c1.619-2.798 4.764-4.347 7.969-3.925 3.205 .422 5.842 2.732 6.681 5.855l13.61 50.78c-2.752 .593-5.415 1.545-7.92 2.83-2.758-3.316-6.16-6.038-10-8L100.32 46.11c-.572-2.056-.298-4.256 .76-6.11ZM69.33 157.14c-1.769-2.685-1.759-6.168 .025-8.842 1.784-2.674 4.997-4.021 8.155-3.418l10.09 2c4.326 .883 7.118 5.103 6.24 9.43-.426 2.088-1.667 3.92-3.448 5.09-1.782 1.17-3.956 1.58-6.042 1.14l-10-2c-2.055-.431-3.858-1.652-5.02-3.4ZM68.17 110.41c.424-2.08 1.657-3.905 3.427-5.076 1.77-1.17 3.933-1.589 6.013-1.164h.13l20.73 4c4.327 .9 7.105 5.138 6.205 9.465-.9 4.327-5.138 7.105-9.465 6.205h-.13l-20.72-4c-4.305-.906-7.071-5.119-6.19-9.43ZM188 159.1c0 33.34-26.7 60.66-59.53 60.9-23.694 .166-45.274-13.608-55.1-35.17l6.24 1.25c10.189 2.084 20.756-.913 28.333-8.036 7.577-7.124 11.22-17.485 9.767-27.784 3.607 2.509 7.692 4.249 12 5.11l2.56 .51c-.16 1.368-.25 2.743-.27 4.12-.024 10.474 4.083 20.535 11.43 28 4.639 4.733 12.237 4.809 16.97 .17 4.733-4.639 4.809-12.237 .17-16.97-4.911-5.006-5.989-12.628-2.66-18.8 1.817-3.349 1.936-7.362 .321-10.813-1.616-3.451-4.774-5.929-8.511-6.677l-15.32-3.06c-4.327-.897-7.107-5.133-6.21-9.46 .897-4.327 5.133-7.107 9.46-6.21l21.4 4.28c16.812 3.393 28.914 18.149 28.95 35.3Z"),
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
        return _handPeace!!
    }

private var _handPeace: ImageVector? = null
