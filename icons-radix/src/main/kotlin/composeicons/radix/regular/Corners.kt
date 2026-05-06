package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Corners: ImageVector
    get() {
        if (_corners != null) return _corners!!
        _corners = radixIcon(
            name = "Corners",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.5 9C2.776 9 3 9.224 3 9.5v.6c0 .428 0 .72 .019 .945 .018 .219 .051 .331 .091 .409 .096 .188 .249 .341 .437 .437 .078 .04 .19 .073 .409 .091 .225 .018 .517 .019 .945 .019h.6c.276 0 .5 .224 .5 .5C6 12.776 5.776 13 5.5 13h-.621c-.402 0-.734-0-1.005-.023-.281-.023-.54-.072-.782-.195-.376-.192-.682-.498-.874-.874-.124-.243-.172-.501-.195-.782C2 10.856 2 10.523 2 10.121v-.621C2 9.224 2.224 9 2.5 9ZM12.5 9c.276 0 .5 .224 .5 .5v.621c0 .402-0 .734-.023 1.005-.023 .281-.072 .54-.195 .782-.192 .376-.498 .682-.874 .874-.243 .124-.501 .172-.782 .195-.271 .022-.603 .023-1.005 .023h-.621C9.224 13 9 12.776 9 12.5 9 12.224 9.224 12 9.5 12h.6c.428 0 .72-0 .945-.019 .219-.018 .331-.051 .409-.091 .188-.096 .341-.248 .437-.437 .04-.078 .073-.19 .091-.409 .018-.225 .019-.517 .019-.945v-.6C12 9.224 12.224 9 12.5 9ZM5.5 2C5.776 2 6 2.224 6 2.5 6 2.776 5.776 3 5.5 3h-.6c-.428 0-.72 0-.945 .019-.219 .018-.331 .051-.409 .091-.188 .096-.341 .249-.437 .437-.04 .078-.073 .19-.091 .409C3 4.18 3 4.472 3 4.9v.6C3 5.776 2.776 6 2.5 6 2.224 6 2 5.776 2 5.5v-.621c-0-.402 0-.734 .022-1.005 .023-.281 .072-.54 .195-.782 .192-.376 .498-.682 .874-.874 .243-.124 .501-.172 .782-.195C4.145 2 4.477 2 4.879 2h.621ZM10.121 2c.402-0 .734 0 1.005 .022 .281 .023 .54 .072 .782 .195 .376 .192 .682 .498 .874 .874 .124 .243 .172 .501 .195 .782 .022 .27 .023 .603 .023 1.005v.621C13 5.776 12.776 6 12.5 6 12.224 6 12 5.776 12 5.5v-.6c0-.428-0-.72-.019-.945-.018-.219-.051-.331-.091-.409-.096-.188-.248-.341-.437-.437-.078-.04-.19-.073-.409-.091C10.82 3 10.528 3 10.1 3h-.6C9.224 3 9 2.776 9 2.5 9 2.224 9.224 2 9.5 2h.621Z"),
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
        return _corners!!
    }

private var _corners: ImageVector? = null
