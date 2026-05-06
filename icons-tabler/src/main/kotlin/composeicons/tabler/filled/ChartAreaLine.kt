package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartAreaLine: ImageVector
    get() {
        if (_chartAreaLine != null) return _chartAreaLine!!
        _chartAreaLine = tablerFilledIcon(
            name = "ChartAreaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.22 9.375c.341-.426 .961-.499 1.393-.165l.094 .083 4 4c.155 .156 .255 .358 .284 .576L21 14v5c-0 .507-.38 .934-.883 .993L20 20h-16.022l-.11-.009-.11-.02-.107-.034-.105-.046-.1-.059-.094-.07-.06-.055-.072-.082-.064-.089-.054-.096-.016-.035-.04-.103-.027-.106-.015-.108L3 18.978l.009-.11 .019-.105c.01-.04 .022-.077 .035-.112l.046-.105 .059-.1L7.168 12.446c.253-.381 .733-.542 1.165-.39l.114 .05 3.277 1.638L15.219 9.375Z")
            addPathData("M15.232 3.36c.345-.414 .956-.481 1.382-.15l.093 .083 4 4c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13l-.094-.083L16.067 5.482l-4.299 5.158c-.267 .321-.706 .442-1.1 .303l-.115-.049L7.299 9.268 4.8 12.6c-.302 .403-.857 .518-1.295 .269l-.105-.069c-.403-.302-.518-.857-.269-1.295l.069-.105L6.2 7.4c.263-.351 .724-.489 1.137-.341l.11 .047 3.291 1.645L15.232 3.36Z")
        }
        return _chartAreaLine!!
    }

private var _chartAreaLine: ImageVector? = null
