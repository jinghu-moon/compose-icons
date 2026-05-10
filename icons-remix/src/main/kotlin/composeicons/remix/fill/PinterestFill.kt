package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PinterestFill: ImageVector
    get() {
        if (_pinterestFill != null) return _pinterestFill!!
        _pinterestFill = remixIcon(
            name = "PinterestFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.372 2.094C8.425 1.413 3.734 4.485 2.381 9.293c-1.353 4.808 1.046 9.877 5.622 11.876-.06-.768-.005-1.541 .162-2.293 .185-.839 1.296-5.463 1.296-5.463-.222-.496-.332-1.034-.325-1.577 0-1.485 .857-2.593 1.923-2.593 .387-.006 .758 .157 1.016 .447 .258 .29 .377 .677 .326 1.061 0 .9-.578 2.262-.879 3.539-.121 .475-.01 .98 .301 1.36 .311 .38 .783 .589 1.273 .564 1.898 0 3.171-2.431 3.171-5.301 0-2.201-1.458-3.847-4.143-3.847C10.826 7.015 9.564 7.5 8.632 8.405c-.932 .906-1.451 2.154-1.438 3.454-.029 .713 .201 1.413 .648 1.97 .172 .128 .238 .354 .162 .554-.046 .185-.162 .623-.208 .785-.019 .111-.09 .205-.191 .255-.1 .05-.219 .05-.319-.001C5.902 14.867 5.25 13.344 5.25 11.605c0-2.847 2.385-6.255 7.154-6.255 3.796 0 6.319 2.778 6.319 5.748 0 3.909-2.176 6.848-5.393 6.848-.977 .031-1.902-.439-2.454-1.247 0 0-.578 2.316-.692 2.754-.232 .757-.576 1.475-1.018 2.131 .923 .28 1.882 .42 2.846 .416 2.652 .002 5.196-1.052 7.072-2.928 1.875-1.876 2.927-4.422 2.924-7.075C22.004 7.003 18.318 2.776 13.372 2.094Z"),
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
        return _pinterestFill!!
    }

private var _pinterestFill: ImageVector? = null
