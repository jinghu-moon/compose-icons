package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) return _facebookLogo!!
        _facebookLogo = phosphorFillIcon(
            name = "FacebookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 128c-.068 52.598-39.339 96.892-91.55 103.26-1.136 .129-2.274-.235-3.124-1-.851-.765-1.333-1.857-1.326-3v-75.26h24c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003-.367-4.268-3.967-7.528-8.25-7.47h-23.75v-24c0-8.837 7.163-16 16-16h16c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003-.367-4.275-3.979-7.538-8.27-7.47h-15.73c-17.673 0-32 14.327-32 32v24h-24c-2.217-.005-4.336 .91-5.853 2.527-1.517 1.617-2.294 3.791-2.147 6.003 .367 4.275 3.979 7.538 8.27 7.47h23.73v75.28c.007 1.142-.474 2.232-1.323 2.996-.848 .764-1.983 1.129-3.117 1.004C61.85 224.739 22.094 178.161 24.07 124.09c2-54 45.74-97.9 99.78-100 28.269-1.095 55.767 9.36 76.168 28.961C220.418 72.652 231.964 99.709 232 128Z"),
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
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
