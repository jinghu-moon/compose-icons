package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandSwipeRight: ImageVector
    get() {
        if (_handSwipeRight != null) return _handSwipeRight!!
        _handSwipeRight = phosphorThinIcon(
            name = "HandSwipeRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 140v36c0 24.66-8.08 41.1-8.42 41.79-.989 1.977-3.393 2.779-5.37 1.79-1.977-.989-2.779-3.393-1.79-5.37C196.49 214.06 204 198.66 204 176v-36c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16v4c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-68c0-8.837-7.163-16-16-16C99.163 52 92 59.163 92 68v108c-.006 1.781-1.189 3.344-2.902 3.833-1.713 .489-3.543-.213-4.488-1.723l-18.68-30c-.027-.038-.05-.078-.07-.12C61.442 140.335 51.655 137.712 44 142.13c-7.655 4.418-10.278 14.205-5.86 21.86l29.31 50c.903 1.883 .206 4.143-1.6 5.19-1.806 1.047-4.114 .529-5.3-1.19L31.22 168c-6.652-11.465-2.75-26.153 8.715-32.805 11.465-6.652 26.153-2.75 32.805 8.715L84 162v-94C84 54.745 94.745 44 108 44c13.255 0 24 10.745 24 24v38.13c6.807-6.095 16.485-7.796 24.963-4.387 8.478 3.409 14.284 11.336 14.977 20.447 7.041-6.34 17.152-7.945 25.81-4.096 8.658 3.849 14.24 12.431 14.25 21.906ZM250.83 53.17l-32-32c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L238.34 52h-62.34c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h62.34L213.17 85.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l32-32c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83Z"),
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
        return _handSwipeRight!!
    }

private var _handSwipeRight: ImageVector? = null
