package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Gear: ImageVector
    get() {
        if (_gear != null) return _gear!!
        _gear = radixIcon(
            name = "Gear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.928 .65c.397 0 .741 .275 .829 .662l.237 1.05c.379 .11 .742 .261 1.081 .447l.911-.574c.336-.211 .773-.162 1.054 .118l.607 .606c.281 .281 .33 .719 .118 1.055l-.574 .91c.186 .339 .337 .701 .447 1.08l1.05 .238c.387 .088 .662 .432 .662 .829v.856c0 .397-.275 .741-.662 .829l-1.05 .238c-.11 .379-.262 .741-.448 1.08l.574 .911c.212 .336 .162 .773-.118 1.054l-.606 .606c-.281 .281-.719 .33-1.055 .118l-.911-.574c-.339 .186-.701 .337-1.08 .447l-.237 1.05c-.088 .387-.432 .662-.829 .662h-.857c-.397 0-.741-.275-.829-.662L6.004 12.638c-.379-.11-.74-.261-1.078-.447l-.911 .575c-.336 .212-.774 .162-1.055-.118l-.606-.606c-.28-.281-.329-.718-.118-1.054l.575-.912C2.624 9.736 2.472 9.375 2.362 8.996L1.312 8.758C.925 8.67 .65 8.326 .65 7.929v-.856c0-.397 .275-.741 .662-.829L2.362 6.005c.11-.379 .261-.74 .447-1.079L2.235 4.015C2.023 3.679 2.072 3.241 2.353 2.96l.605-.605c.281-.281 .719-.33 1.055-.118l.911 .574c.339-.186 .7-.338 1.079-.448L6.242 1.312C6.33 .925 6.674 .65 7.071 .65h.857ZM6.715 3.068c-.659 .116-1.268 .375-1.795 .744L3.56 2.955l-.606 .606 .858 1.36c-.369 .527-.628 1.136-.744 1.795L1.5 7.072v.856l1.568 .355c.116 .659 .375 1.268 .744 1.795l-.857 1.361 .605 .606 1.361-.858c.527 .369 1.135 .628 1.794 .744l.355 1.567h.857l.355-1.567c.659-.116 1.268-.375 1.795-.744l1.36 .858 .606-.606-.857-1.36c.369-.527 .628-1.137 .744-1.796l1.567-.355v-.856L11.932 6.717c-.116-.659-.375-1.269-.744-1.796l.857-1.36-.605-.605-1.36 .857C9.553 3.443 8.943 3.184 8.284 3.068L7.928 1.5h-.857L6.715 3.068ZM7.5 5.075c1.339 0 2.426 1.086 2.426 2.425 0 1.339-1.087 2.425-2.426 2.425C6.161 9.924 5.075 8.839 5.075 7.5 5.075 6.161 6.161 5.075 7.5 5.075ZM7.5 5.975C6.658 5.976 5.975 6.658 5.975 7.5c0 .842 .682 1.525 1.524 1.525 .842 0 1.525-.683 1.525-1.525C9.025 6.658 8.342 5.975 7.5 5.975Z"),
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
        return _gear!!
    }

private var _gear: ImageVector? = null
