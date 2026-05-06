package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) return _linkSimpleBreak!!
        _linkSimpleBreak = phosphorFillIcon(
            name = "LinkSimpleBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM144.56 173.66l-21.45 21.45c-17.246 16.798-44.79 16.616-61.813-.407C44.274 177.68 44.092 150.136 60.89 132.89L82.34 111.43c3.123-3.126 8.189-3.128 11.315-.005 3.126 3.123 3.128 8.189 .005 11.315L72.2 144.2c-10.935 10.935-10.935 28.665 0 39.6 10.935 10.935 28.665 10.935 39.6 0l21.45-21.46c3.126-3.123 8.192-3.121 11.315 .005 3.123 3.126 3.121 8.192-.005 11.315ZM195.11 123.11l-21.45 21.45c-3.123 3.126-8.189 3.128-11.315 .005-3.126-3.123-3.128-8.189-.005-11.315l21.46-21.45c10.935-10.935 10.935-28.665 0-39.6-10.935-10.935-28.665-10.935-39.6 0L122.74 93.66c-3.126 3.123-8.192 3.121-11.315-.005-3.123-3.126-3.121-8.192 .005-11.315L132.89 60.89c17.246-16.798 44.79-16.616 61.813 .407 17.023 17.023 17.205 44.567 .407 61.813Z"),
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
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
