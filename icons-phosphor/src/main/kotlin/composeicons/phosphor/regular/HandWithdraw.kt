package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HandWithdraw: ImageVector
    get() {
        if (_handWithdraw != null) return _handWithdraw!!
        _handWithdraw = phosphorRegularIcon(
            name = "HandWithdraw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 198.65v41.35c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-41.35C215.925 177.893 207.232 158.1 192 144v58.35c-.003 3.535-2.326 6.65-5.714 7.66-3.388 1.01-7.037-.323-8.976-3.28L166.63 190.42c-.08-.12-.16-.25-.23-.38-3.267-5.769-10.591-7.797-16.36-4.53-5.769 3.267-7.797 10.591-4.53 16.36l22.13 33.79c2.419 3.698 1.383 8.656-2.315 11.075-3.698 2.419-8.656 1.383-11.075-2.315l-22.26-34-.24-.38c-7.131-12.22-4.025-27.839 7.238-36.402 11.263-8.563 27.144-7.377 37.012 2.762v-112.4h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16c8.837 0 16 7.163 16 16v59.62c24.931 16.847 39.908 44.941 40 75.03ZM88 56c0-4.418-3.582-8-8-8h-16C55.163 48 48 55.163 48 64v136c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-136h16c4.418 0 8-3.582 8-8ZM157.66 98.34C156.159 96.838 154.123 95.994 152 95.994c-2.123 0-4.159 .844-5.66 2.346L128 116.69v-100.69c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v100.69L93.66 98.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32l32 32c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l32-32c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66Z"),
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
        return _handWithdraw!!
    }

private var _handWithdraw: ImageVector? = null
