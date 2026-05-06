package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Sunrise: ImageVector
    get() {
        if (_sunrise != null) return _sunrise!!
        _sunrise = tablerFilledIcon(
            name = "Sunrise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 16c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1C2.448 18 2 17.552 2 17c0-.552 .448-1 1-1Z")
            addPathData("M12 12c2.761 0 5 2.239 5 5 0 .552-.448 1-1 1h-8C7.448 18 7 17.552 7 17c0-2.761 2.239-5 5-5")
            addPathData("M21 16c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1 0-.552 .448-1 1-1Z")
            addPathData("M6.307 9.893l.7 .7c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012l-.7-.7c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012")
            addPathData("M19.107 9.893c.39 .391 .39 1.024 0 1.414l-.7 .7c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402l.7-.7c.39-.39 1.023-.39 1.414 0")
            addPathData("M12.707 2.293l3 3c.26 .251 .364 .623 .273 .973-.092 .35-.365 .623-.714 .714-.35 .092-.721-.013-.973-.273L13 5.415v3.585c-0 .507-.38 .934-.883 .993L12 10c-.552 0-1-.448-1-1v-3.586L9.707 6.707C9.315 7.086 8.691 7.081 8.305 6.695 7.919 6.309 7.914 5.685 8.293 5.293L11.251 2.333c.045-.05 .096-.095 .15-.135l.127-.08 .068-.033 .11-.041 .12-.029c.3-.055 .627 .024 .881 .278")
            addPathData("M3 20h18c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-18C2.448 22 2 21.552 2 21c0-.552 .448-1 1-1")
            addPathData("M12 12c1.687-0 3.261 .85 4.185 2.262 .924 1.412 1.074 3.194 .398 4.74h-9.166c-.676-1.546-.526-3.329 .398-4.74C8.739 12.85 10.313 12 12 12")
        }
        return _sunrise!!
    }

private var _sunrise: ImageVector? = null
